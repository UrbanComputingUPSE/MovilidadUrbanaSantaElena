package ec.edu.upse.facsistel.urban_computing.data_structures;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * This class represents a SpatioTemporal Point. 
 * That is a point that contains attached some timestamp.
 * It also contains metadata to describe the type of specific SpatioTemporalPoint.
 * The Property reading represents the reading of a property at that specific point.
 * @author ivansanchez
 *
 */
public class SpatioTemporalPoint {
	private final UUID id = UUID.randomUUID();
	private SpatialPoint spatialPoint;
	private Instant timeStamp = Instant.now();
	private Metadata metadata;
	private List<PropertyReading> propertyReadings = new ArrayList<PropertyReading>();
	
	public SpatioTemporalPoint(SpatialPoint spatialPoint, Instant timeStamp) {
		super();
		this.spatialPoint = spatialPoint;
		this.timeStamp = timeStamp;
	}

	public SpatioTemporalPoint(SpatialPoint spatialPoint, Instant timeStamp, Metadata metadata,
			ArrayList<PropertyReading> propertyReadings) {
		super();
		this.spatialPoint = spatialPoint;
		this.timeStamp = timeStamp;
		this.metadata = metadata;
		this.propertyReadings = propertyReadings;
	}



	public SpatialPoint getSpatialPoint() {
		return spatialPoint;
	}

	public void setSpatialPoint(SpatialPoint spatialPoint) {
		this.spatialPoint = spatialPoint;
	}

	public Instant getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Instant timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public List<PropertyReading> getPropertyReadings() {
		return propertyReadings;
	}

	public void setPropertyReadings(List<PropertyReading> propertyReadings) {
		this.propertyReadings = propertyReadings;
	}

	public UUID getId() {
		return id;
	}

	@Override
	public String toString() {
		return "SpatioTemporalPoint [id=" + id + ", spatialPoint=" + spatialPoint + ", timeStamp=" + timeStamp
				+ ", metadata=" + metadata + ", propertyReading=" + propertyReadings + "]";
	}
	
	
	
}
