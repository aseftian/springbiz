package aseftian.springbiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aseftian.springbiz.domain.Product;

/**
 * 
 * @author ASeftian
 *
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
