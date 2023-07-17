package de.ait.homework.repositories;

import de.ait.homework.models.Products;

import java.util.List;

public interface ProductsRepository {
    public List<Products> findAllProducts();
}
