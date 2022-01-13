package com.loto.oriented.c.object.a.usage;

/**
 * Author：蓝田_Loto
 * <p>PageName：Phone.java
 * </p>
 * <p>Function：定义手机类
 */

public class Phone {
    // 成员变量
    String brand; // 品牌
    double price; // 价格
    double size;  // 尺寸

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    // 成员方法
    void call(String name) {
        System.out.println("调用成员方法：打电话给" + name);
    }

    void sendMeg(String name) {
        System.out.println("调用成员方法：发短信给" + name);
    }
}
