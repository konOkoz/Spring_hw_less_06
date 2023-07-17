package de.ait.homework.services.Impl;


import de.ait.homework.models.Products;
import de.ait.homework.repositories.ProductsRepository;
import de.ait.homework.services.ProductsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {
    private ProductsRepository productsRepository;

    public ProductsServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Products> getAllProducts() {
       return productsRepository.findAllProducts();
    }
}
