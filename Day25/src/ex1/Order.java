package ex1;

import java.util.List;

/**
 * @author XinLan Wang
 * @create 2020-03-18 9:38
 */
public class Order<T> {//泛型类,T代表不确定的引用类型
    private int orderId;
    private String orderName;

    @Override
    public String toString() {
        return "Order{" +
                orderT;
    }

//
//    public <E>list<E> copyArrayToList(E[] arr){
//        return arr;
//    }
    public Order() {
    }

    public Order(int orderId, T orderT){
        this.orderId = orderId;
        this.orderT = orderT;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    private T orderT;
}
