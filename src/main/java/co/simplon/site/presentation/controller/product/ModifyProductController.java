package co.simplon.site.presentation.controller.product;

import co.simplon.site.business.dto.ProductDTO;
import co.simplon.site.business.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ModifyProductController {

    private final IProductService productService;

    @Autowired
    public ModifyProductController(IProductService productService) {

        this.productService = productService;
    }

    @PutMapping("/product/{id}")
    public void modifyProduct(@PathVariable int id, @RequestBody ProductDTO productDTO) {
        productService.modifyProduct(id, productDTO);
    }

}
