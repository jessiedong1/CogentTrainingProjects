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
public class OptionGroup implements  Serializable {
	private static final long serialVersionUID = 4L;
	@Id @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int optionGroupID;
	@Column
	private String optionGroupName;
}
