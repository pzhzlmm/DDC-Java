import org.junit.Test;

import java.io.*;

public class FosTest {
    @Test
    public void test4() throws IOException {
        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("text4.png"));
            FileInputStream fis = new FileInputStream(new File("text.png"));
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //写的操作
            byte[] buff = new byte[1024];
            int len = 0;
            while ((len = bis.read(buff)) != -1){
                bos.write(buff,0,len);
            }
            /*while ((len = bis.read(buff)) != -1) ;
            {
                bos.write(buff, 0, len);
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null) {
                    bis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
