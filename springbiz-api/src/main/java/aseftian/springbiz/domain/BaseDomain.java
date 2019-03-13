package aseftian.springbiz.domain;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public class BaseDomain {

	@Getter
	@Setter
	private Date createdAt;
	@Getter
	@Setter
	private Date updatedAt;
	@Getter
	@Setter
	private String updateBy;
}
