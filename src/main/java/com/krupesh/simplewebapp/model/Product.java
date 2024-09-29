package com.krupesh.simplewebapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Product {
    private int id;
    private String name;
    private int price;

    public Product() {
    }
}
