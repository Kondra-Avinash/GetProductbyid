package dev.avinash.productservices.dtos;

import dev.avinash.productservices.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDTO {

    private long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private Category category;
}
