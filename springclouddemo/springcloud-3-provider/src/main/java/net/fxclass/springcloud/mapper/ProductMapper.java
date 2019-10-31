package net.fxclass.springcloud.mapper;

import net.fxclass.springcloud.entities.Product;

import java.util.List;

public interface ProductMapper {
    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
