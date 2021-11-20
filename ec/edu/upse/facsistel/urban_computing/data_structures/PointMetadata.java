package ec.edu.upse.facsistel.urban_computing.data_structures;

public class PointMetadata {
	private String name;
	private String description;
	
	public PointMetadata(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
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

	@Override
	public String toString() {
		return "PointMetadata [name=" + name + ", description=" + description + "]";
	}
	
	
	
}
