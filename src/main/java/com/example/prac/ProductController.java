package com.example.prac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
@RestController
public class ProductController {
    @Autowired
    ProductServiceInterfaceImpl productServiceInterfaceImpl;


    @GetMapping("/getProducts")
    public List<Products> getProducts (){

        return this.productServiceInterfaceImpl.getProducts();
    }

    @GetMapping("/products/{productsId}")
    public Products getProductsById (@PathVariable String productsId){
        return this.productServiceInterfaceImpl.getProductsById(Long.parseLong(productsId));
    }

    @PostMapping("/addProducts")
    public Products addProducts (@RequestBody Products products){

        return this.productServiceInterfaceImpl.createProducts(products);
    }

    @DeleteMapping("/deleteProducts/{productsId}")
    public ResponseEntity<HttpStatus> deleteProducts(@PathVariable String productsId) {
        try {
            this.productServiceInterfaceImpl.deleteProducts(Long.parseLong(productsId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

}
