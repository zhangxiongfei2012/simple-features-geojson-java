package mil.nga.sf.geojson.wfs;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Collection Info
 * 
 * @author osbornb
 */
@JsonPropertyOrder({ "name", "title", "description", "links", "extent", "crs" })
public class CollectionInfo extends FeaturesObject {

	/**
	 * Serialization Version number
	 */
	private static final long serialVersionUID = 1L;

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

	/**
	 * Constructor
	 */
	public CollectionInfo() {

	}

	/**
	 * Constructor
	 * 
	 * @param name
	 *            name
	 */
	public CollectionInfo(String name) {
		this.name = name;
	}

	/**
	 * Get the name
	 * 
	 * @return name
	 */
	@JsonInclude(JsonInclude.Include.ALWAYS)
	public String getName() {
		return name;
	}

	/**
	 * Set the name
	 * 
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the title
	 * 
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Set the title
	 * 
	 * @param title
	 *            title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Get the description
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Set the description
	 * 
	 * @param description
	 *            description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Get the links
	 * 
	 * @return links
	 */
	@JsonInclude(JsonInclude.Include.ALWAYS)
	public List<Link> getLinks() {
		return links;
	}

	/**
	 * Set the links
	 * 
	 * @param links
	 *            links
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}

	/**
	 * Add a link
	 * 
	 * @param link
	 *            link
	 */
	public void addLink(Link link) {
		this.links.add(link);
	}

	/**
	 * Get the extent
	 * 
	 * @return extent
	 */
	public Extent getExtent() {
		return extent;
	}

	/**
	 * Set the extent
	 * 
	 * @param extent
	 *            extent
	 */
	public void setExtent(Extent extent) {
		this.extent = extent;
	}

	/**
	 * Get the crs
	 * 
	 * @return crs list
	 */
	public List<String> getCrs() {
		return crs;
	}

	/**
	 * Set the crs
	 * 
	 * @param crs
	 *            crs list
	 */
	public void setCrs(List<String> crs) {
		this.crs = crs;
	}

	/**
	 * Add a crs
	 * 
	 * @param crs
	 *            crs
	 */
	public void addCrs(String crs) {
		this.crs.add(crs);
	}

}
