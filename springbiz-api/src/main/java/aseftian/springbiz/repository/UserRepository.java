package aseftian.springbiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aseftian.springbiz.domain.User;

/**
 * 
 * @author ASeftian
 * @since 18/03/2019
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
