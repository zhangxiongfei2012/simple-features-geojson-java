package mil.nga.sf.geojson.test.wfs;

import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

import junit.framework.TestCase;
import mil.nga.sf.geojson.Feature;
import mil.nga.sf.geojson.FeatureConverter;
import mil.nga.sf.geojson.wfs.Link;
import mil.nga.sf.geojson.wfs.WfsFeatureCollection;

public class WfsFeatureCollectionTest {

	@Test
	public void testFeatureCollection() throws JsonProcessingException {
		String content = "{\n" + "  \"type\": \"FeatureCollection\",\n"
				+ "  \"features\": [\n" + "    {\n"
				+ "      \"type\": \"Feature\",\n" + "      \"geometry\": {\n"
				+ "        \"type\": \"Point\"\n" + "      },\n"
				+ "      \"properties\": {}\n" + "    }\n" + "  ],\n"
				+ "  \"links\": [\n" + "    {\n"
				+ "      \"href\": \"http://data.example.org/\",\n"
				+ "      \"rel\": \"self\",\n"
				+ "      \"type\": \"application/geo+json\",\n"
				+ "      \"hreflang\": \"en\"\n" + "    }\n" + "  ],\n"
				+ "  \"timeStamp\": \"2018-04-02T15:14:20-04:00\",\n"
				+ "  \"numberMatched\": 10,\n" + "  \"numberReturned\": 5\n"
				+ "}";
		WfsFeatureCollection featureCollection = new WfsFeatureCollection(
				FeatureConverter.toFeatureCollection(content));
		TestCase.assertEquals(10,
				featureCollection.getNumberMatched().intValue());
		TestCase.assertEquals(5,
				featureCollection.getNumberReturned().intValue());
		TestCase.assertEquals("2018-04-02T15:14:20-04:00",
				featureCollection.getTimeStamp());
		List<Link> links = featureCollection.getLinks();
		TestCase.assertNotNull(links);
		TestCase.assertEquals(1, links.size());
		Link link = links.get(0);
		TestCase.assertEquals("http://data.example.org/", link.getHref());
		TestCase.assertEquals("self", link.getRel());
		TestCase.assertEquals("application/geo+json", link.getType());
		TestCase.assertEquals("en", link.getHreflang());
		TestCase.assertNotNull(featureCollection);

		featureCollection.setLinks(links);

		String stringValue = FeatureConverter.mapper
				.writeValueAsString(featureCollection);
		TestCase.assertNotNull(stringValue);
		JsonNode nodeFromPojo = FeatureConverter.mapper
				.valueToTree(featureCollection);
		TestCase.assertNotNull(nodeFromPojo);

	}

	@Test
	public void testFeature() {
		String content = "{\n" + "  \"type\": \"Feature\",\n"
				+ "  \"geometry\": {\n" + "    \"type\": \"Point\"\n" + "  },\n"
				+ "  \"properties\": {\n" + "    \"name\": \"string\",\n"
				+ "    \"function\": \"residential\",\n"
				+ "    \"floors\": 0,\n"
				+ "    \"lastUpdate\": \"2019-06-15T21:55:52.722Z\"\n" + "  }\n"
				+ "}";
		Feature feature = FeatureConverter.toFeature(content);
		TestCase.assertNotNull(feature);
	}

}
