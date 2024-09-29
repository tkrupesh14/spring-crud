package com.krupesh.simplewebapp.controller;

import com.krupesh.simplewebapp.model.Product;
import com.krupesh.simplewebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ProductController {
    @Autowired
    ProductService service;
    public List<Product> getProducts(){
        return service.getProducts();
    }

    public Product getProductById(int id){
        return service.getProductById(id);
    }
    public void addProduct(Product product){
        service.addProduct(product);
    }
    public void updateProduct(Product product){
        service.updateProduct(product);
    }
    public void deleteProduct(int id){
        service.deleteProduct(id);
    }
}
