package ec.edu.upse.facsistel.urban_computing.data_structures;

/** 
 * A property represents some attribute to be collected 
 * by a sensor or any other data agregation technique or equipment.
 * @author ivansanchez
 *
 */
public class Property {
	private String name;
	private String description;
	private PropertyValueType propertyValueType;
	
	public Property(String name, String description, PropertyValueType propertyValueType) {
		super();
		this.name = name;
		this.description = description;
		this.propertyValueType = propertyValueType;
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

	public PropertyValueType getPropertyValueType() {
		return propertyValueType;
	}

	public void setPropertyValueType(PropertyValueType propertyValueType) {
		this.propertyValueType = propertyValueType;
	}

	@Override
	public String toString() {
		return "Property [name=" + name + ", description=" + description + ", propertyValueType=" + propertyValueType
				+ "]";
	}
	
	
	
	
}
