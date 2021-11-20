package ec.edu.upse.facsistel.urban_computing.data_structures;

/**
 * This class represents a PropertyValue to be
 * expanded via inheritance.
 * Property values could be primarly of two types, 
 * numerical and categorical.
 * @author ivansanchez
 *
 */
public abstract class PropertyValueType {
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
