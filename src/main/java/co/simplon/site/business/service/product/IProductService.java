package co.simplon.site.business.service.product;

import co.simplon.site.business.dto.ProductDTO;

import java.util.List;

public interface IProductService {

    /**
     * Service permettant de lister les contacts
     *
     * @return liste de tous les contacts
     */
    List<ProductDTO> listerProducts();

    /**
     * @param id
     * @return
     */
    ProductDTO recupererParId(final int id);
    /**
     * @param product
     */
    void addProduct(final ProductDTO product);

    /**
     * @param product
     */
    void modifyProduct(int id, final ProductDTO product);
    /**
     * @param id
     */
    void deleteProduct(int id);
}
