package ec.edu.upse.facsistel.urban_computing.data_structures;

import java.util.UUID;

/**
 * The Spatial Point represents a point in a 
 * geographical location via Latitude, Longitude and Altitude.
 * @author ivansanchez
 *
 */
public class SpatialPoint {
	private final UUID id = UUID.randomUUID();
	private double latitude;
	private double longitude;
	private double altitude;
	
	public SpatialPoint(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public SpatialPoint(double latitude, double longitude, double altitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}

	
	
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public UUID getId() {
		return id;
	}

	@Override
	public String toString() {
		return "SpatialPoint [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", altitude="
				+ altitude + "]";
	}
	
	
	
}
