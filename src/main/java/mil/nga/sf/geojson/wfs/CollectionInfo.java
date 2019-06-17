package mil.nga.sf.geojson.wfs;

import java.util.ArrayList;
import java.util.List;

public class CollectionInfo {

	/**
	 * Identifier of the collection used
	 */
	private String name;

	/**
	 * Human readable title of the collection
	 */
	private String title;

	/**
	 * A description of the features in the collection
	 */
	private String description;

	/**
	 * Collection of links
	 */
	private List<Link> links = new ArrayList<>();

	/**
	 * Extent
	 */
	private Extent extent;

	/**
	 * CRS
	 */
	private List<String> crs = new ArrayList<>();

}
