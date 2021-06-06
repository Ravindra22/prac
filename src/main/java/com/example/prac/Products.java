package com.example.prac;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class Products {
@Id
    private long id;
    private String productName;
    private Integer price;
    private String productDesc;

    public Products(){
        super();
    }



    public Products(Long id,String productName,Integer price,String productDesc){
        super();
        this.id=id;
        this.productName=productName;
        this.price=price;
        this.productDesc=productDesc;

    }

    public long getId() {
        return id;
    }



    public String getProductName() {
        return productName;
    }



    public Integer getPrice() {
        return price;
    }



    public String getProductDesc() {
        return productDesc;
    }




}
