package model;

import java.util.List;

/**
 * Created by linhtran on 03/05/2017.
 */
public class Customer {
    private int id;
    private String name;
    private String comment;
    private List<String> products;
    private  Address address;
    public Customer() {
    }

    public Customer(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public Customer(int id, String name, String comment) {
        this.id = id;
        this.name = name;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }


}
