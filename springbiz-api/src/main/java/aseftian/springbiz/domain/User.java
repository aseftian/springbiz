package aseftian.springbiz.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "t_users")
public class User extends BaseDomain implements Serializable {
	private static final long serialVersionUID = -3607797321496481084L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotBlank
	@Column(unique = true)
	@Size(min = 6, max = 50)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Column(name = "first_name")
	private String firstName;

	@Size(max = 50)
	@Column(name = "last_name")
	private String lastName;

	@Column(unique = true, nullable = true)
	private String email;

	private String password;

	public User(@NotBlank @Size(min = 6, max = 50) String username, @NotBlank @Size(max = 50) String firstName,
			@Size(max = 50) String lastName) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
