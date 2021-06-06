package com.example.prac;

import java.util.List;

public interface ProductsServiceInterface {
    List<Products> getProducts();
    Products getProductsById(Long id);
    Products createProducts(Products products);
    void  deleteProducts(Long id);

}
