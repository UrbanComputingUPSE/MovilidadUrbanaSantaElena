package ec.edu.upse.facsistel.urban_computing.data_structures;

import java.util.UUID;

/**
 * A property reading is a value of a property to 
 * be attached to some geographical data.
 * @author ivansanchez
 *
 */
public class PropertyReading {
	private final UUID id = UUID.randomUUID();
	private Property property;
	private PropertyValueType value;
	
	public PropertyReading(Property property, PropertyValueType value) {
		super();
		this.property = property;
		this.value = value;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public PropertyValueType getValue() {
		return value;
	}

	public void setValue(PropertyValueType value) {
		this.value = value;
	}

	public UUID getId() {
		return id;
	}

	@Override
	public String toString() {
		return "PropertyReading [id=" + id + ", property=" + property + ", value=" + value + "]";
	}
	
	
	
}
