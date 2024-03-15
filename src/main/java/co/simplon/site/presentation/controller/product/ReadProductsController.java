package co.simplon.site.presentation.controller.product;

import co.simplon.site.business.dto.ProductDTO;
import co.simplon.site.business.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReadProductsController {
    private final IProductService productService;
    @Autowired
    public ReadProductsController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<ProductDTO> listerProducts() {
        return productService.listerProducts();
    }
}