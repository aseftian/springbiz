package aseftian.springbiz.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name = "t_order_details")
public class OrderDetail extends BaseDomain implements Serializable {
	private static final long serialVersionUID = 1903416710060786023L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false)
	private Order order;
	@OneToOne
	@JoinColumn(name = "product_id", nullable = false)
	private Product product;
	private Integer qty;
	private Double unitPrice;
	private Double disc;
	private Double total;
}
