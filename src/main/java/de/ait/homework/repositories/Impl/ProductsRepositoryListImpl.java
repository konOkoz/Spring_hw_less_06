package de.ait.homework.repositories.Impl;

import de.ait.homework.models.Products;
import de.ait.homework.repositories.ProductsRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ProductsRepositoryListImpl implements ProductsRepository {
private List<Products> products;

    public ProductsRepositoryListImpl(List<Products> products) {
        Products product1 = new Products("Apple",12,false);
        Products product2 = new Products("Mango",3,true);
        Products product3 = new Products("Banan",5,false);
        Products product4 = new Products("Pear",7,false);
        Products product5 = new Products("Watermelon",2,true);
        this.products= Arrays.asList(product1,product2,product3,product4,product5);
    }

    public List<Products> findAllProducts(){
        return products;
    }
}
