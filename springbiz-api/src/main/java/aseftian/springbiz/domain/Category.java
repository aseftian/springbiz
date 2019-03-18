package aseftian.springbiz.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 
 * @author ASeftian
 * @since 18/03/2019
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "t_categories")
public class Category extends BaseDomain implements Serializable {
	private static final long serialVersionUID = 4117021287734101585L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String description;
	@OneToMany
	@JoinTable(name = "t_product_categories", 
		joinColumns = @JoinColumn(name = "category_id", referencedColumnName="id", insertable = false, updatable = false), 
		inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName="id", insertable = false, updatable = false))
	private List<Product> products;

}
