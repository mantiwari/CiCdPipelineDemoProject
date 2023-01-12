package Controller;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.ProductRepository;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public Iterable<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
