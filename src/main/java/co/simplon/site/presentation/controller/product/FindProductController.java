package co.simplon.site.presentation.controller.product;

import co.simplon.site.business.dto.ProductDTO;
import co.simplon.site.business.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindProductController {
    private final IProductService productService;

    @Autowired
    public FindProductController(IProductService productService) {

        this.productService = productService;
    }
    @GetMapping("/product/{id}")
    public ProductDTO findById(@PathVariable int id) {

        return productService.findById(id);
    }
}
