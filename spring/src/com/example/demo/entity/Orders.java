package com.example.demo.entity;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/15 21:18
 * @description：
 */
public class Orders {
    private String orderName;

    private String address;

    /**
     * 有参构造器
     *
     * @param orderName
     * @param address
     */
    public Orders(String orderName, String address) {
        this.orderName = orderName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderName='" + orderName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
