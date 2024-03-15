package co.simplon.site.business.convert;

import co.simplon.site.business.dto.ProductDTO;
import co.simplon.site.persistance.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductConvert {

    private static ProductConvert instance;

    private ProductConvert() {

 }
    public static ProductConvert getInstance() {
     if (instance == null)
         instance = new ProductConvert();
     return instance;
    }


public ProductDTO convertEntityToDto(final Product entity) {
    final ProductDTO dto = new ProductDTO();
    dto.setId_product(entity.getId());
    dto.setName_product(entity.getName());
    dto.setPrice_product(entity.getPrice());
    dto.setRef_product(entity.getRef());
    dto.setDesc_product(entity.getDesc());
    dto.setImg_product(entity.getImg());
    dto.setQuantity_product(entity.getQuantity());

    return dto;
}

public Product convertDtoToEntity(final ProductDTO dto) {
        final Product entity = new Product();
        entity.setId(dto.getId_product());
        entity.setName(dto.getName_product());
        entity.setPrice(dto.getPrice_product());
        entity.setRef(dto.getRef_product());
        entity.setDesc(dto.getDesc_product());
        entity.setImg(dto.getImg_product());
        entity.setQuantity(dto.getQuantity_product());
        return entity;
}

public List<ProductDTO> convertListEntityToListDto(final List<Product> listEntities) {
    final List<ProductDTO> listeDto = new ArrayList<>();
    for(final Product entity : listEntities) {
        listeDto.add(convertEntityToDto(entity));
    }
    return listeDto;
}

    public List<Product> convertListDtoToListEntity(final List<ProductDTO> listDto) {
        final List<Product> listeEntities = new ArrayList<>();
        for(final ProductDTO dto : listDto) {
            listeEntities.add(convertDtoToEntity(dto));
        }
        return listeEntities;
    }



}