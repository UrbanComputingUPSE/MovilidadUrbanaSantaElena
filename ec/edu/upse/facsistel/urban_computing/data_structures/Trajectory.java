package ec.edu.upse.facsistel.urban_computing.data_structures;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a trajectory.
 * A trajectory is a spatiotemporal data structure composed by
 * a sequence of spatial points with timestamps 
 * (represented as a list of SpatioTemporalPoints).
 * @author ivansanchez
 *
 */
public class Trajectory {
	
	private Metadata metadata;
	List<SpatioTemporalPoint> spatialPoints = new ArrayList<SpatioTemporalPoint>();
}
