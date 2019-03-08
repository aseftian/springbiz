package aseftian.springbiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aseftian.springbiz.domain.ProductAttribute;

/**
 * 
 * @author ASeftian
 *
 */

@Repository
public interface ProductAttributeRepository extends JpaRepository<ProductAttribute, Integer> {

}
