package model;

import java.io.Serializable;

/**
 * @program: MybatisWork
 * @Date: 2018/9/2/002 22:29
 * @Author: Mr.Qiu
 * @Description:
 */
public class Order implements Serializable {
    private Integer id;
    private String orderNo;
    private float price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", price=" + price +
                '}';
    }
}
