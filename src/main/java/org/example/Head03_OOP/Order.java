package org.example.Head03_OOP;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private boolean isPaid;
    private List<Product> products;

    public Order(){
        this.orderId ="NONE";
        this.products = new ArrayList<>();
        this.isPaid =false;
    }

    public Order(String orderId,List<Product> products){
        this.orderId=orderId;
        this.products=products;
        this.isPaid=false;
    }
    public Order(String orderId){
        this(orderId,new ArrayList<>());
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
