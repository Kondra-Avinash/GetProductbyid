package dev.avinash.productservices.services;

import dev.avinash.productservices.dtos.FakeStoreProductDTO;
import dev.avinash.productservices.models.Category;
import dev.avinash.productservices.models.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService {
    @Override
    public Product getSingleProduct(Long id) {
        RestTemplate restTemplate = new RestTemplate();

        FakeStoreProductDTO fakeStoreProductDTO = restTemplate
                .getForObject("https://fakestoreapi.com/products/" + id, FakeStoreProductDTO.class);

        Product product = new Product();
        product.setId(fakeStoreProductDTO.getId());
        product.setTitle(fakeStoreProductDTO.getTitle());
        product.setPrice(fakeStoreProductDTO.getPrice());
        product.setDescription(fakeStoreProductDTO.getDescription());
        product.setImage(fakeStoreProductDTO.getImage());

        Category category = new Category();
        category.setTitle(fakeStoreProductDTO.getTitle());
        product.setCategory(category);

        return product;
    }
}
