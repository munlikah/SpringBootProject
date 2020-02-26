package tni.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "user")

public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "first_name")
	private String fname;
	
	@Column(name = "last_name")
	private String lname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	/*@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", 
		joinColumns = @JoinColumn(name = "user_id"), 
		inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;*/
	
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;

}
