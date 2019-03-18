package aseftian.springbiz.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@Table(name = "t_orders")
public class Order extends BaseDomain implements Serializable {
	private static final long serialVersionUID = 1948880793589726468L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String invoiceNumber;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_date")
	private Date orderDate;
	private String orderChannel;
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderDetail> orderDetails;
	private Double total;
	private Double disc;
	private LocalDate shippingDate;
	private String shippingCourier;
	private String shippingCourierType;
	private Double shippingFee;
	private String shippingReceiptNumber;
	private String paymentMethod;
	private String paymentBank;
	private String notes;
}
