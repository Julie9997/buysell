package ru.julie.buysell.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.julie.buysell.models.Product;
import ru.julie.buysell.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j //логироование
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> listProducts(String title) {
        if (title != null) return productRepository.findByTitle(title);
        return productRepository.findAll();
    }

    public void saveProduct(Product product){
        log.info("Saving new {}", product); // поскольку метод toString() переопределен, подставит строковое представление продукт
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null); // метод репозитория возвращает тип Optional
    }
}
