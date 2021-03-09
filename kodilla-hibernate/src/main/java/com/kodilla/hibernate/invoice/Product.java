package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {
    private int id;
    private String name;

    public Product(){};

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "NAME")
    public String getName() {
        return name;
    }
}
