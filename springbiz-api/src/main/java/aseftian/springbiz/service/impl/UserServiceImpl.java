package aseftian.springbiz.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import aseftian.springbiz.domain.User;
import aseftian.springbiz.service.UserService;

/**
 * 
 * @author ASeftian
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public <S extends User> List<S> save(Iterable<S> itrbl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S save(S s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> Optional<S> findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> findAll(Pageable pgb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
