package aseftian.springbiz.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 
 * @author ASeftian
 * @since 18/03/2019
 * 
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "t_products")
public class Product extends BaseDomain implements Serializable {
	private static final long serialVersionUID = -5853080443683347168L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String sku;
	private String name;
	private Double unitPrice;
	private Double disc;
	@ManyToOne
	@JoinTable(name = "t_product_categories", 
		joinColumns = @JoinColumn(name = "product_id", referencedColumnName="id", nullable = false, updatable = false), 
		inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName="id", nullable = false, updatable = false))
	private Category category;
	@OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
	private List<ProductDetail> details;

}
