package com.example.prac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceInterfaceImpl implements ProductsServiceInterface {
    @Autowired
   ProductsDao productsDao;

    @Override
    public List<Products> getProducts() {
        return productsDao.findAll();
    }

    @Override
    public Products getProductsById(Long id) {
        return productsDao.getOne(id);
    }

    @Override
    public Products createProducts(Products products) {
        productsDao.save(products);
        return products;
    }

    @Override
    public void deleteProducts(Long id) {
        Products entity= productsDao.getOne(id);
        productsDao.delete(entity);

    }
}
