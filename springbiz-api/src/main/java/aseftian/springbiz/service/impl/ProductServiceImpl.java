package aseftian.springbiz.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import aseftian.springbiz.domain.Product;
import aseftian.springbiz.service.BaseService;

@Service
public class ProductServiceImpl implements BaseService<Product, Integer> {

	@Override
	public <S extends Product> List<S> save(Iterable<S> itrbl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> S save(S s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Product> Optional<S> findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> findAll(Pageable pgb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
