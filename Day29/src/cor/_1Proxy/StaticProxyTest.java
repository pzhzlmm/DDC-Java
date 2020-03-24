package cor._1Proxy;

/**
 * version: 1.0
 *
 * @author XinLan Wang
 * @create 2020-03-24 9:46
 * @description: StaticProxyTest 类的主要功能为:
 */
interface ClothFactory{
    void produceCloth();
}

class NikeFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        
    }
}

class NikeProxyFactory implements ClothFactory{
    ClothFactory factory;

    public NikeProxyFactory(ClothFactory factory){
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("耐克生产前");
        factory.produceCloth();
        System.out.println("耐克生产后");
    }
}

public class StaticProxyTest{

    public static void main(String[] args) {
        NikeProxyFactory nikeProxyFactory = new NikeProxyFactory(new NikeFactory());
        nikeProxyFactory.produceCloth();
    }
}
