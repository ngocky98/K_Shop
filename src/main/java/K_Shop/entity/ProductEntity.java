package K_Shop.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity{
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private String price;


	@Column(name = "description", columnDefinition = "TEXT")
	private String description;
	
	@OneToOne
    @JoinColumn(name = "branch_id", referencedColumnName = "id")
	private BranchEntity branch;
	
	@OneToOne
    @JoinColumn(name = "cat_id", referencedColumnName = "id")
	private CategoryEntity category;
	
	@OneToMany(mappedBy="product", cascade = CascadeType.ALL)
    private Set<ImageEntity> image;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BranchEntity getBranch() {
		return branch;
	}

	public void setBranch(BranchEntity branch) {
		this.branch = branch;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
	
	

}
