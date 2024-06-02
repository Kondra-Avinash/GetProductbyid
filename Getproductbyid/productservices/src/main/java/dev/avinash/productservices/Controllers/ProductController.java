package dev.avinash.productservices.Controllers;

import dev.avinash.productservices.models.Product;
import dev.avinash.productservices.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    ProductService productservice;

    public ProductController(ProductService productservice) {
        this.productservice = productservice;
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable ("id") Long id){
        return productservice.getSingleProduct(id);

    }

}
