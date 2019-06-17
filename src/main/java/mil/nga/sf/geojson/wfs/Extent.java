package mil.nga.sf.geojson.wfs;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Extent
 * 
 * @author osbornb
 */
@JsonPropertyOrder({ "crs", "spatial", "trs", "temporal" })
@JsonInclude(Include.NON_EMPTY)
public class Extent extends FeaturesObject {

	/**
	 * Serialization Version number
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Coordinate reference system of the coordinates in the spatial extent
	 * (property spatial).
	 */
	private String crs;

	/**
	 * West, north, east, south edges of the spatial extent. The minimum and
	 * maximum values apply to the coordinate reference system WGS84
	 * longitude/latitude that is supported in the Core. If, for example, a
	 * projected coordinate reference system is used, the minimum and maximum
	 * values need to be adjusted.
	 */
	private List<Double> spatial = new ArrayList<>();

	/**
	 * Temporal reference system of the coordinates in the temporal extent
	 * (property temporal). In the Core, only the Gregorian calendar is
	 * supported. Extensions may support additional temporal reference systems.
	 */
	private String trs;

	/**
	 * Begin and end times of the temporal extent.
	 */
	private List<String> temporal = new ArrayList<>();

	/**
	 * Constructor
	 */
	public Extent() {

	}

	/**
	 * Get the coordinate reference system
	 * 
	 * @return coordinate reference system
	 */
	public String getCrs() {
		return crs;
	}

	/**
	 * Set the coordinate reference system
	 * 
	 * @param crs
	 *            coordinate reference system
	 */
	public void setCrs(String crs) {
		this.crs = crs;
	}

	/**
	 * Get the spatial extent
	 * 
	 * @return spatial extent
	 */
	public List<Double> getSpatial() {
		return spatial;
	}

	/**
	 * Set the spatial extent
	 * 
	 * @param spatial
	 *            spatial extent
	 */
	public void setSpatial(List<Double> spatial) {
		this.spatial = spatial;
	}

	/**
	 * Get the Temporal reference system
	 * 
	 * @return temporal reference system
	 */
	public String getTrs() {
		return trs;
	}

	/**
	 * Set the temporal reference system
	 * 
	 * @param trs
	 *            reference system
	 */
	public void setTrs(String trs) {
		this.trs = trs;
	}

	/**
	 * Get the temporal extent
	 * 
	 * @return temporal begin and end times
	 */
	public List<String> getTemporal() {
		return temporal;
	}

	/**
	 * Set the temporal extent
	 * 
	 * @param temporal
	 *            temporal begin and end times
	 */
	public void setTemporal(List<String> temporal) {
		this.temporal = temporal;
	}

}
