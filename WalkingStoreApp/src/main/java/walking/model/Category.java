package walking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category implements  Serializable {
	private static final long serialVersionUID = 2L;
	@Id @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int categoryID;
	@Column
	private String categoryName;
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int categoryID, String categoryName) {
		this.categoryID = categoryID;
		this.categoryName = categoryName;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	

}
