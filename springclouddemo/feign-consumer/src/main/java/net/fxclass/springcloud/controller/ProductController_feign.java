package net.fxclass.springcloud.controller;

import net.fxclass.springcloud.entities.Product;
import net.fxclass.springcloud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.print.attribute.standard.PrinterURI;
import java.util.List;

/**
 * @Auther: 梦学谷
 */
@RestController
public class ProductController_feign {

    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product){
        return productService.add(product);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id){
        return productService.get(id);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list(){
        return productService.list();
    }



}
