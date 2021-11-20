package ec.edu.upse.facsistel.urban_computing.data_structures;

import java.util.UUID;

/**
 * This class represents a Static Point, 
 * which includes a Unique ID, a Spatial Point (coordinates)
 * and metadata.
 * @author ivansanchez
 *
 */
public class StaticPoint {
	private final UUID id = UUID.randomUUID();
	private SpatialPoint spatialPoint;
	private Metadata metadata;
	
	public StaticPoint(SpatialPoint spatialPoint) {
		super();
		this.spatialPoint = spatialPoint;
	}
	
	public StaticPoint(SpatialPoint spatialPoint, Metadata metadata) {
		super();
		this.spatialPoint = spatialPoint;
		this.metadata = metadata;
	}

	public SpatialPoint getSpatialPoint() {
		return spatialPoint;
	}

	public void setSpatialPoint(SpatialPoint spatialPoint) {
		this.spatialPoint = spatialPoint;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public UUID getId() {
		return id;
	}

	@Override
	public String toString() {
		return "StaticPoint [id=" + id + ", spatialPoint=" + spatialPoint + ", metadata=" + metadata + "]";
	}
	
	
	
}
