package ru.julie.buysell.services;

import org.springframework.stereotype.Service;
import ru.julie.buysell.models.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "Playstation 5", "description", 50000, "Москва", "Автор 1"));
        products.add(new Product(++ID, "Nintendo switch", "description", 25000, "Москва", "Автор 2"));
    }

    public List<Product> listProducts() {return products; }

    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) return product;
        }
        return null;
    }
}
