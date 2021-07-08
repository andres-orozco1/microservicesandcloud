package academy.digitallab.store.shopping.model;

import lombok.Data;


@Data
public class Product {

    private long id;
    private String name;
    private String description;
    private Double stock;
    private Double price;
    private String status;
    private Category category;
}
