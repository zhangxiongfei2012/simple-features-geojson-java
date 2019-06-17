package mil.nga.sf.geojson.wfs;

import java.util.Collection;

import com.fasterxml.jackson.databind.JsonNode;

import mil.nga.sf.geojson.FeatureConverter;

/**
 * WFS Features Converter
 * 
 * @author osbornb
 */
public class WfsFeaturesConverter {

	/**
	 * Convert the string content to a content
	 * 
	 * @param content
	 *            string content
	 * @return content
	 */
	public static Content toContent(String content) {
		return FeatureConverter.toTypedObject(Content.class, content);
	}

	/**
	 * Convert the object value to a content
	 * 
	 * @param value
	 *            object value
	 * @return content
	 */
	public static Content toContent(Object value) {
		return FeatureConverter.toTypedObject(Content.class, value);
	}

	/**
	 * Convert the JSON tree to a content
	 * 
	 * @param tree
	 *            tree node
	 * @return content
	 */
	public static Content toContent(JsonNode tree) {
		return FeatureConverter.toTypedObject(Content.class, tree);
	}

	/**
	 * Convert the string content to a collection info
	 * 
	 * @param content
	 *            string content
	 * @return collection info
	 */
	public static CollectionInfo toCollectionInfo(String content) {
		return FeatureConverter.toTypedObject(CollectionInfo.class, content);
	}

	/**
	 * Convert the object value to a collection info
	 * 
	 * @param value
	 *            object value
	 * @return collection info
	 */
	public static CollectionInfo toCollectionInfo(Object value) {
		return FeatureConverter.toTypedObject(CollectionInfo.class, value);
	}

	/**
	 * Convert the JSON tree to a collection info
	 * 
	 * @param tree
	 *            tree node
	 * @return collection info
	 */
	public static CollectionInfo toCollectionInfo(JsonNode tree) {
		return FeatureConverter.toTypedObject(CollectionInfo.class, tree);
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
			Collection<mil.nga.sf.Geometry> simpleGeometries) {
		return new WfsFeatureCollection(
				FeatureConverter.toFeatureCollection(simpleGeometries));
	}

}
