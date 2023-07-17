package de.ait.homework.controllers;

import de.ait.homework.models.Products;
import de.ait.homework.services.ProductsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductsController {
    private final ProductsService ProductsService;

    public ProductsController(ProductsService service){
        this.ProductsService = service;
    }
    @GetMapping("/products")
    @ResponseBody
    public List<Products> giveAllProducts(){
       return ProductsService.getAllProducts();
    }
}
