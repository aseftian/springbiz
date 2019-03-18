package aseftian.springbiz.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "t_persons")
public class Person extends BaseDomain implements Serializable {
	private static final long serialVersionUID = -6807518945617356480L;

}
