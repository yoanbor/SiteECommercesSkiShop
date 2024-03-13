package co.simplon.site.persistance.repository.product;
import co.simplon.site.persistance.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IProductRepository extends JpaRepository<Product, Integer>{
@Query(ProductQuery.REQUETE_RECUPERER_PAR_ID)
    Product Getproductbyid(final String id);
}
