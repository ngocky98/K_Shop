package K_Shop.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "branch")
public class BranchEntity extends BaseEntity{
	
	@Column(name = "name")
	private String name;

	@Column(name = "description", columnDefinition = "TEXT")
	private String description;
	
	@Column(name = "thumbnail")
	private String thumbnail;
	
	@OneToMany(mappedBy="branch", cascade = CascadeType.ALL)
    private Set<CategoryEntity> category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public Set<CategoryEntity> getCategory() {
		return category;
	}

	public void setCategory(Set<CategoryEntity> category) {
		this.category = category;
	}

	
}
