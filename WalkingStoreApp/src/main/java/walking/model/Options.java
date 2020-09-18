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
public class Options implements  Serializable {
	private static final long serialVersionUID = 3L;
	@Id @Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int optionID;
	@ManyToOne()
	@JoinColumn(name="optionGroupID")
	private OptionGroup optGroup;
	@Column 
	private String optionName;
	@Column
	private int stocks;
}
