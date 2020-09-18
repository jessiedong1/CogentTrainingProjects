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
public class Orders implements  Serializable {
	private static final long serialVersionUID = 7L;
	@Id @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderID;
	@Column
	private double orderAmount;
	
	@ManyToOne
	@JoinColumn(name="OrderCustomerID")
	private Customer customer;
	

}
