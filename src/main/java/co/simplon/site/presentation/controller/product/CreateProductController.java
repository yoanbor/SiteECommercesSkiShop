package co.simplon.site.presentation.controller.product;

import co.simplon.site.business.dto.ProductDTO;
import co.simplon.site.business.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateProductController {
    private final IProductService productService;

    @Autowired
    public CreateProductController(IProductService productService) {
        this.productService = productService;
    }

    @PostMapping(path = "/product")
    public void addProduct(@RequestBody ProductDTO productDTO) {
        productService.addProduct(productDTO);
    }
}
