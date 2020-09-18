package walking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class OrderDetail implements  Serializable {
	private static final long serialVersionUID = 8L;
	@Id @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int detailID;
	@OneToOne
	@JoinColumn(name="detailOrderID")
	private Orders order;
	@OneToOne
	@JoinColumn(name = "DetailProductID")
	private Product product;
	
	
	
}
