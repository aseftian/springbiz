package aseftian.springbiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aseftian.springbiz.domain.ProductCategory;

/**
 * 
 * @author ASeftian
 *
 */

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

}
