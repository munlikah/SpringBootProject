package tni.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "role")

public class Role {
	
	@Id
	@GeneratedValue
	@Column(name = "role_id")
	private int id;
	
	@Column(name = "role_name")
	private String name;
	
	@Column(name = "role_desc")
	private String desc;
	
	@OneToMany(mappedBy = "role")
	private List<User> userList;

}
