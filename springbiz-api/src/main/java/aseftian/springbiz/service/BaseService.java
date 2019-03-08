package aseftian.springbiz.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 
 * @author ASeftian
 *
 * @param <T>
 * @param <ID>
 */
public interface BaseService<T extends Object, ID extends Serializable> {

	<S extends T> List<S> save(@Nonnull Iterable<S> itrbl);

	<S extends T> S save(@Nonnull S s);

	<S extends T> Optional<S> findOne(@Nonnull ID id);

	List<T> findAll();

	Page<T> findAll(@Nullable Pageable pgb);

	void delete(@Nonnull ID id);

}
