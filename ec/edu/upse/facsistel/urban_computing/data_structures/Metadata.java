package ec.edu.upse.facsistel.urban_computing.data_structures;

/**
 * Metadata is just data about the data.
 * This metadata is to be attached to geographical information 
 * to enhance it or describe it.
 * @author ivansanchez
 *
 */
public class Metadata {
	private String name;
	private String description;
	
	public Metadata(String name, String description) {
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
