package co.simplon.site.presentation.controller;

import co.simplon.site.business.dto.ProductDTO;
import co.simplon.site.business.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {

        this.productService = productService;
    }

    @GetMapping("/products")
    public List<ProductDTO> listerProducts() {

        return productService.listerProducts();
    }

    @GetMapping("/product/{id}")
    public ProductDTO findById(@PathVariable int id) {

        return productService.findById(id);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody ProductDTO productDTO) {
        productService.addProduct(productDTO);
    }

    @PutMapping("/product/{id}")
    public void modifyProduct(@PathVariable int id, @RequestBody ProductDTO productDTO) {
        productService.modifyProduct(id, productDTO);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id) {

        productService.deleteProduct(id);

    }

}
