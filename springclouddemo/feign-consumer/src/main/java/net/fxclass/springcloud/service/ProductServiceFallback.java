package net.fxclass.springcloud.service;

import net.fxclass.springcloud.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceFallback implements ProductService{
    @Override
    public boolean add(Product product) {
        return false;
    }

    @Override
    public Product get(Long id) {
        return new Product(id,"ID="+id+"无效","无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }
}
