package walking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee implements Serializable{
	private static final long serialVersionUID = 9L;
	@Id @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empID;
	@Column 
	private String firstName;
	@Column 
	private String lastName;
	@Column
	private String password;
	@ManyToOne()
	@JoinColumn(name="deptID")
	private Department dept;
	
	
	
}
