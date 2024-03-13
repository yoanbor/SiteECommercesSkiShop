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
    dto.setId(entity.getId());
    dto.setName(entity.getName());
    dto.setPrice(entity.getPrice());
    dto.setRef(entity.getRef());
    dto.setDesc(entity.getDesc());
    dto.setImg(entity.getImg());
    dto.setQuantity(entity.getQuantity());

    return dto;
}

public Product convertDtoToEntity(final ProductDTO dto) {
        final Product entity = new Product();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setRef(dto.getRef());
        entity.setDesc(dto.getDesc());
        entity.setImg(dto.getImg());
        entity.setQuantity(dto.getQuantity());
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