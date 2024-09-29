package com.krupesh.simplewebapp.service;

import com.krupesh.simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Laptop", 50000),
            new Product(102, "Mobile", 20000),
            new Product(103, "Tablet", 10000)));
    public List<Product> getProducts(){
        return products;
    }
    public  Product getProductById(int id){
        return products.stream().filter(p -> p.getId() == id).findFirst().get();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product){
        for(int i = 0; i < products.size(); i++){
            Product p = products.get(i);
            if(p.getId() == product.getId()){
                products.set(i, product);
                return;
            }
        }
    }
    public void deleteProduct(int id){
        products.removeIf(p -> p.getId() == id);
    }
}
