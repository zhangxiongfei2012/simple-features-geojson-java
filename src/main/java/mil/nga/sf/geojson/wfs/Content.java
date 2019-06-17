package mil.nga.sf.geojson.wfs;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Content
 * 
 * @author osbornb
 */
@JsonPropertyOrder({ "links", "collections" })
@JsonInclude(Include.ALWAYS)
public class Content extends FeaturesObject {

	/**
	 * Serialization Version number
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Collection of links
	 */
	private List<Link> links = new ArrayList<>();

	/**
	 * Collection of collections
	 */
	private List<CollectionInfo> collections = new ArrayList<>();

	/**
	 * Constructor
	 */
	public Content() {

	}

	/**
	 * Get the links
	 * 
	 * @return links
	 */
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
	 * Get the collections
	 * 
	 * @return collections
	 */
	public List<CollectionInfo> getCollections() {
		return collections;
	}

	/**
	 * Set the collections
	 * 
	 * @param collections
	 *            collections
	 */
	public void setCollections(List<CollectionInfo> collections) {
		this.collections = collections;
	}

	/**
	 * Add a collection
	 * 
	 * @param collection
	 *            collection info
	 */
	public void addCollection(CollectionInfo collection) {
		this.collections.add(collection);
	}

}
