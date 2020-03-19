package ex4$;

import java.util.List;

/**
 * @author XinLan Wang
 * @create 2020-03-18 15:02
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1001",new User(1,42,"小红"));
        dao.save("1002",new User(2,25,"小明"));
        dao.save("1003",new User(3,17,"小紫"));

        List<User> list = dao.list();
        //listfor快捷生成
//        for (User user : list) {
//        }


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
