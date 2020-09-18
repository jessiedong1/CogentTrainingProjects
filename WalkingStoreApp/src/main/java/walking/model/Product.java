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
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productID;
	@Column
	private String productName;
	@Column
	private double productPrice;
//	@Column
//	private int productSize;
//	@Column
//	private int productColor;
	@ManyToOne()
	@JoinColumn(name="CategoryID")
	private Category category;
//	@Column
//	private String[] comments;
	
	public Product(int productID, String productName, double productPrice, Category category) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.category = category;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getProductID() {
		return productID;
	}

	
	

}
