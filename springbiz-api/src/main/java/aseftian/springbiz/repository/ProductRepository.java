package aseftian.springbiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aseftian.springbiz.domain.Product;

/**
 * 
 * @author ASeftian
 * @since 18/03/2019
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
