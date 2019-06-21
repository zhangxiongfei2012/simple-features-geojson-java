package mil.nga.sf.geojson.wfs;

import com.fasterxml.jackson.databind.JsonNode;

import mil.nga.sf.geojson.FeatureConverter;

/**
 * WFS Features Converter
 * 
 * @author osbornb
 */
public class WfsFeaturesConverter {

	/**
	 * Convert the string content to a collections
	 * 
	 * @param content
	 *            string content
	 * @return collections
	 */
	public static Collections toCollections(String content) {
		return FeatureConverter.toTypedObject(Collections.class, content);
	}

	/**
	 * Convert the object value to a collections
	 * 
	 * @param value
	 *            object value
	 * @return collections
	 */
	public static Collections toCollections(Object value) {
		return FeatureConverter.toTypedObject(Collections.class, value);
	}

	/**
	 * Convert the JSON tree to a collections
	 * 
	 * @param tree
	 *            tree node
	 * @return collections
	 */
	public static Collections toCollections(JsonNode tree) {
		return FeatureConverter.toTypedObject(Collections.class, tree);
	}

	/**
	 * Convert the string content to a collection
	 * 
	 * @param content
	 *            string content
	 * @return collection
	 */
	public static Collection toCollection(String content) {
		return FeatureConverter.toTypedObject(Collection.class, content);
	}

	/**
	 * Convert the object value to a collection
	 * 
	 * @param value
	 *            object value
	 * @return collection
	 */
	public static Collection toCollection(Object value) {
		return FeatureConverter.toTypedObject(Collection.class, value);
	}

	/**
	 * Convert the JSON tree to a collection
	 * 
	 * @param tree
	 *            tree node
	 * @return collection
	 */
	public static Collection toCollection(JsonNode tree) {
		return FeatureConverter.toTypedObject(Collection.class, tree);
	}

	/**
	 * Convert the string content to a feature collection
	 * 
	 * @param content
	 *            string content
	 * @return feature collection
	 */
	public static WfsFeatureCollection toFeatureCollection(String content) {
		return new WfsFeatureCollection(
				FeatureConverter.toFeatureCollection(content));
	}

	/**
	 * Convert the object value to a feature collection
	 * 
	 * @param value
	 *            object value
	 * @return feature collection
	 */
	public static WfsFeatureCollection toFeatureCollection(Object value) {
		return new WfsFeatureCollection(
				FeatureConverter.toFeatureCollection(value));
	}

	/**
	 * Convert the JSON tree to a feature collection
	 * 
	 * @param tree
	 *            tree node
	 * @return feature collection
	 */
	public static WfsFeatureCollection toFeatureCollection(JsonNode tree) {
		return new WfsFeatureCollection(
				FeatureConverter.toFeatureCollection(tree));
	}

	/**
	 * Convert a simple geometry to a feature collection
	 * 
	 * @param simpleGeometry
	 *            simple geometry
	 * @return feature collection
	 */
	public static WfsFeatureCollection toFeatureCollection(
			mil.nga.sf.Geometry simpleGeometry) {
		return new WfsFeatureCollection(
				FeatureConverter.toFeatureCollection(simpleGeometry));
	}

	/**
	 * Convert simple geometries to a feature collection
	 * 
	 * @param simpleGeometries
	 *            simple geometries
	 * @return feature collection
	 */
	public static WfsFeatureCollection toFeatureCollection(
			java.util.Collection<mil.nga.sf.Geometry> simpleGeometries) {
		return new WfsFeatureCollection(
				FeatureConverter.toFeatureCollection(simpleGeometries));
	}

}
