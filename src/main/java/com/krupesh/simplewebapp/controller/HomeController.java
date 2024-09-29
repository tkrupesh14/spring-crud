package com.krupesh.simplewebapp.controller;

import com.krupesh.simplewebapp.model.Product;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private  ProductController productController;

    @Operation(summary = "Hello World")
    @GetMapping("/")
    public String greet() {
        return "Hello World!";
    }
    @Operation(summary = "Get all products")
    @GetMapping("/products")
    public List<Product> getProducts(){
        return productController.getProducts();
    }
    @Operation(summary = "Get product by id")
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable int id){
        return productController.getProductById(id);
    }
    @Operation(summary = "Add a product")
    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
        productController.addProduct(product);
    }
    @Operation(summary = "Update a product")
    @PutMapping("/product")
    public void updateProduct(@RequestBody Product product){
        productController.updateProduct(product);
    }
    @Operation(summary = "Delete a product")
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id){
        productController.deleteProduct(id);
    }

}
