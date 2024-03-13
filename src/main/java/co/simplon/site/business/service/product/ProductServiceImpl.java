package co.simplon.site.business.service.product;

import co.simplon.site.business.convert.ProductConvert;
import co.simplon.site.business.dto.ProductDTO;
import co.simplon.site.persistance.entity.Product;
import co.simplon.site.persistance.repository.product.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {


    private IProductRepository ProductRepo;

    @Override
    public List<ProductDTO> listerProducts() {
        final List<Product> result = ProductRepo.findAll();
        return ProductConvert.getInstance().convertListEntityToListDto(result);
    }

    @Override
    public ProductDTO recupererParId(int id) {
        final Product result = ProductRepo.getReferenceById(id);
        return ProductConvert.getInstance().convertEntityToDto(result);
    }

    @Override
    public void addProduct(ProductDTO product) {
     ProductRepo.save(ProductConvert.getInstance().convertDtoToEntity(product));

    }

    @Override
    public void modifyProduct(ProductDTO product) {
        ProductRepo.save(ProductConvert.getInstance().convertDtoToEntity(product));

    }

    @Override
    public void deleteProduct(ProductDTO product) {
        ProductRepo.delete(ProductConvert.getInstance().convertDtoToEntity(product));

    }
}
