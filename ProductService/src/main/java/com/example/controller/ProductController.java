package com.example.controller;


import com.example.domain.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/products")
public class ProductController {



    @GetMapping("/")
    public ResponseEntity<List<Product>> getProdcuts(){
        return new ResponseEntity<>(getProducts(), HttpStatus.OK);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Optional<Product>> getProduct(@PathVariable long productId){
        Optional<Product> product = getProducts().stream().filter(p-> p.getProductId() == productId).findFirst();
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    private List<Product> getProducts(){
        List<Product> products = new ArrayList<>(50);
        Product p = null;
        for(int i=0;i<50;i++){
            p = new Product(i,"product " + i, "description of product "+ i);
            products.add(p);
        }
        return products;
    }


}
