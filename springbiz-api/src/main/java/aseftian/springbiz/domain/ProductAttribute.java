package aseftian.springbiz.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author ASeftian
 * @since 18/03/2019
 */

@Data
@NoArgsConstructor
@Entity
@Table(name = "t_product_attributes")
public class ProductAttribute implements Serializable {
	private static final long serialVersionUID = 3194184586722197953L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String type;
	private String description;
}
