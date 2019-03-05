package aseftian.springbiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aseftian.springbiz.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
