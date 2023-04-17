package com.example.SOC.controller;
import com.example.SOC.model.Product;
import com.example.SOC.respository.ProductRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ProductCon {
    @Autowired
    private ProductRes res;

    @PostMapping("/createManyProduct")
    public List<Product> createManyProduct(@RequestBody List<Product> products){
        return res.saveAll(products);
    }

    @PostMapping("/checkInventory")
    public  Boolean checkInventory(@RequestBody Product pro){
        Product product = res.findByName(pro.getName());
        if(product.getQuantity() > pro.getQuantity()){
            return true;
        }
        return false;
    }
}
