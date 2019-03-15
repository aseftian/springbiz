package aseftian.springbiz.domain;

import java.util.Date;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseDomain {

	private Date createdAt;
	private Date updatedAt;
	private String updateBy;
}
