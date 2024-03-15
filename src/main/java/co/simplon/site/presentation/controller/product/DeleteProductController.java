package co.simplon.site.presentation.controller.product;

import co.simplon.site.business.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeleteProductController {
    private final IProductService productService;
    @Autowired
    public DeleteProductController(IProductService productService) {
    this.productService = productService;
}

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
}







