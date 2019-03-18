package aseftian.springbiz.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "t_product_details")
public class ProductDetail extends BaseDomain implements Serializable {
	private static final long serialVersionUID = -2074814457566746222L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "attribute_id", nullable = false)
	private ProductAttribute attribute;
	private String value;
}
