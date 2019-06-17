package mil.nga.sf.geojson.test.wfs;

import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;

import junit.framework.TestCase;
import mil.nga.sf.geojson.Feature;
import mil.nga.sf.geojson.FeatureConverter;
import mil.nga.sf.geojson.wfs.CollectionInfo;
import mil.nga.sf.geojson.wfs.Content;
import mil.nga.sf.geojson.wfs.Extent;
import mil.nga.sf.geojson.wfs.Link;
import mil.nga.sf.geojson.wfs.WfsFeatureCollection;
import mil.nga.sf.geojson.wfs.WfsFeaturesConverter;

public class FeaturesTest {

	@Test
	public void testContent() {

		String contentValue = "{\n" + "  \"links\" : [ {\n"
				+ "    \"rel\" : \"self\",\n"
				+ "    \"type\" : \"application/json\",\n"
				+ "    \"title\" : \"this document\",\n"
				+ "    \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections?f=json\"\n"
				+ "  }, {\n" + "    \"rel\" : \"alternate\",\n"
				+ "    \"type\" : \"application/xml\",\n"
				+ "    \"title\" : \"this document as XML\",\n"
				+ "    \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections?f=xml\"\n"
				+ "  }, {\n" + "    \"rel\" : \"alternate\",\n"
				+ "    \"type\" : \"text/html\",\n"
				+ "    \"title\" : \"this document as HTML\",\n"
				+ "    \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections?f=html\"\n"
				+ "  }, {\n" + "    \"rel\" : \"service\",\n"
				+ "    \"type\" : \"application/openapi+json;version=3.0\",\n"
				+ "    \"title\" : \"the OpenAPI definition as JSON\",\n"
				+ "    \"href\" : \"https://www.ldproxy.nrw.de/kataster/api?f=json\"\n"
				+ "  }, {\n" + "    \"rel\" : \"service\",\n"
				+ "    \"type\" : \"text/html\",\n"
				+ "    \"title\" : \"the OpenAPI definition as HTML\",\n"
				+ "    \"href\" : \"https://www.ldproxy.nrw.de/kataster/api?f=html\"\n"
				+ "  }, {\n" + "    \"rel\" : \"conformance\",\n"
				+ "    \"type\" : \"application/json\",\n"
				+ "    \"title\" : \"WFS 3.0 conformance classes implemented by this server\",\n"
				+ "    \"href\" : \"https://www.ldproxy.nrw.de/kataster/conformance?f=json\"\n"
				+ "  } ],\n"
				+ "  \"crs\" : [ \"http://www.opengis.net/def/crs/EPSG/0/25832\", \"http://www.opengis.net/def/crs/OGC/1.3/CRS84\", \"http://www.opengis.net/def/crs/EPSG/0/3034\", \"http://www.opengis.net/def/crs/EPSG/0/3035\", \"http://www.opengis.net/def/crs/EPSG/0/3043\", \"http://www.opengis.net/def/crs/EPSG/0/3044\", \"http://www.opengis.net/def/crs/EPSG/0/3045\", \"http://www.opengis.net/def/crs/EPSG/0/3857\", \"http://www.opengis.net/def/crs/EPSG/0/4258\", \"http://www.opengis.net/def/crs/EPSG/0/4326\", \"http://www.opengis.net/def/crs/EPSG/0/4647\", \"http://www.opengis.net/def/crs/EPSG/0/5649\", \"http://www.opengis.net/def/crs/EPSG/0/5650\", \"http://www.opengis.net/def/crs/EPSG/0/5651\", \"http://www.opengis.net/def/crs/EPSG/0/5652\", \"http://www.opengis.net/def/crs/EPSG/0/5653\", \"http://www.opengis.net/def/crs/EPSG/0/28992\", \"http://www.opengis.net/def/crs/EPSG/0/25831\", \"http://www.opengis.net/def/crs/EPSG/0/25832\", \"http://www.opengis.net/def/crs/EPSG/0/25833\" ],\n"
				+ "  \"collections\" : [ {\n"
				+ "    \"name\" : \"flurstueck\",\n"
				+ "    \"title\" : \"Flurstück\",\n" + "    \"extent\" : {\n"
				+ "      \"spatial\" : [ 5.61272621360749, 50.2373512077239, 9.58963433710139, 52.5286304537795 ],\n"
				+ "      \"temporal\" : [ \"2018-05-18T14:45:44Z\", \"2019-06-17T21:41:19Z\" ]\n"
				+ "    },\n" + "    \"links\" : [ {\n"
				+ "      \"rel\" : \"item\",\n"
				+ "      \"type\" : \"application/geo+json\",\n"
				+ "      \"title\" : \"Flurstück as GeoJSON\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/flurstueck/items?f=json\"\n"
				+ "    }, {\n" + "      \"rel\" : \"item\",\n"
				+ "      \"type\" : \"application/gml+xml;profile=\\\"http://www.opengis.net/def/profile/ogc/2.0/gml-sf2\\\";version=3.2\",\n"
				+ "      \"title\" : \"Flurstück as GML\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/flurstueck/items?f=xml\"\n"
				+ "    }, {\n" + "      \"rel\" : \"item\",\n"
				+ "      \"type\" : \"text/html\",\n"
				+ "      \"title\" : \"Flurstück as HTML\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/flurstueck/items?f=html\"\n"
				+ "    }, {\n" + "      \"rel\" : \"data\",\n"
				+ "      \"type\" : \"application/json\",\n"
				+ "      \"title\" : \"Information about the Flurstück data\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/flurstueck?f=json\"\n"
				+ "    }, {\n" + "      \"rel\" : \"data\",\n"
				+ "      \"type\" : \"application/gml+xml;profile=\\\\\\\"http://www.opengis.net/def/profile/ogc/2.0/gml-sf2\\\\\\\";version=3.2\",\n"
				+ "      \"title\" : \"Information about the Flurstück data\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/flurstueck?f=xml\"\n"
				+ "    }, {\n" + "      \"rel\" : \"data\",\n"
				+ "      \"type\" : \"text/html\",\n"
				+ "      \"title\" : \"Information about the Flurstück data\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/flurstueck?f=html\"\n"
				+ "    } ],\n"
				+ "    \"crs\" : [ \"http://www.opengis.net/def/crs/EPSG/0/25832\", \"http://www.opengis.net/def/crs/OGC/1.3/CRS84\", \"http://www.opengis.net/def/crs/EPSG/0/3034\", \"http://www.opengis.net/def/crs/EPSG/0/3035\", \"http://www.opengis.net/def/crs/EPSG/0/3043\", \"http://www.opengis.net/def/crs/EPSG/0/3044\", \"http://www.opengis.net/def/crs/EPSG/0/3045\", \"http://www.opengis.net/def/crs/EPSG/0/3857\", \"http://www.opengis.net/def/crs/EPSG/0/4258\", \"http://www.opengis.net/def/crs/EPSG/0/4326\", \"http://www.opengis.net/def/crs/EPSG/0/4647\", \"http://www.opengis.net/def/crs/EPSG/0/5649\", \"http://www.opengis.net/def/crs/EPSG/0/5650\", \"http://www.opengis.net/def/crs/EPSG/0/5651\", \"http://www.opengis.net/def/crs/EPSG/0/5652\", \"http://www.opengis.net/def/crs/EPSG/0/5653\", \"http://www.opengis.net/def/crs/EPSG/0/28992\", \"http://www.opengis.net/def/crs/EPSG/0/25831\", \"http://www.opengis.net/def/crs/EPSG/0/25832\", \"http://www.opengis.net/def/crs/EPSG/0/25833\" ],\n"
				+ "    \"relations\" : {\n"
				+ "      \"bahnstrecken\" : \"Bahnstrecken in 500m Umkreis\",\n"
				+ "      \"gewaesser\" : \"Stehende Gewässer in 4km Umkreis\"\n"
				+ "    }\n" + "  }, {\n"
				+ "    \"name\" : \"gebaeudebauwerk\",\n"
				+ "    \"title\" : \"Gebäude, Bauwerk\",\n"
				+ "    \"extent\" : {\n"
				+ "      \"spatial\" : [ 5.61272621360749, 50.2373512077239, 9.58963433710139, 52.5286304537795 ],\n"
				+ "      \"temporal\" : [ \"2018-05-18T14:45:44Z\", \"2019-06-17T21:41:19Z\" ]\n"
				+ "    },\n" + "    \"links\" : [ {\n"
				+ "      \"rel\" : \"item\",\n"
				+ "      \"type\" : \"application/geo+json\",\n"
				+ "      \"title\" : \"Gebäude, Bauwerk as GeoJSON\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/gebaeudebauwerk/items?f=json\"\n"
				+ "    }, {\n" + "      \"rel\" : \"item\",\n"
				+ "      \"type\" : \"application/gml+xml;profile=\\\"http://www.opengis.net/def/profile/ogc/2.0/gml-sf2\\\";version=3.2\",\n"
				+ "      \"title\" : \"Gebäude, Bauwerk as GML\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/gebaeudebauwerk/items?f=xml\"\n"
				+ "    }, {\n" + "      \"rel\" : \"item\",\n"
				+ "      \"type\" : \"text/html\",\n"
				+ "      \"title\" : \"Gebäude, Bauwerk as HTML\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/gebaeudebauwerk/items?f=html\"\n"
				+ "    }, {\n" + "      \"rel\" : \"data\",\n"
				+ "      \"type\" : \"application/json\",\n"
				+ "      \"title\" : \"Information about the Gebäude, Bauwerk data\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/gebaeudebauwerk?f=json\"\n"
				+ "    }, {\n" + "      \"rel\" : \"data\",\n"
				+ "      \"type\" : \"application/gml+xml;profile=\\\\\\\"http://www.opengis.net/def/profile/ogc/2.0/gml-sf2\\\\\\\";version=3.2\",\n"
				+ "      \"title\" : \"Information about the Gebäude, Bauwerk data\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/gebaeudebauwerk?f=xml\"\n"
				+ "    }, {\n" + "      \"rel\" : \"data\",\n"
				+ "      \"type\" : \"text/html\",\n"
				+ "      \"title\" : \"Information about the Gebäude, Bauwerk data\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/gebaeudebauwerk?f=html\"\n"
				+ "    } ],\n"
				+ "    \"crs\" : [ \"http://www.opengis.net/def/crs/EPSG/0/25832\", \"http://www.opengis.net/def/crs/OGC/1.3/CRS84\", \"http://www.opengis.net/def/crs/EPSG/0/3034\", \"http://www.opengis.net/def/crs/EPSG/0/3035\", \"http://www.opengis.net/def/crs/EPSG/0/3043\", \"http://www.opengis.net/def/crs/EPSG/0/3044\", \"http://www.opengis.net/def/crs/EPSG/0/3045\", \"http://www.opengis.net/def/crs/EPSG/0/3857\", \"http://www.opengis.net/def/crs/EPSG/0/4258\", \"http://www.opengis.net/def/crs/EPSG/0/4326\", \"http://www.opengis.net/def/crs/EPSG/0/4647\", \"http://www.opengis.net/def/crs/EPSG/0/5649\", \"http://www.opengis.net/def/crs/EPSG/0/5650\", \"http://www.opengis.net/def/crs/EPSG/0/5651\", \"http://www.opengis.net/def/crs/EPSG/0/5652\", \"http://www.opengis.net/def/crs/EPSG/0/5653\", \"http://www.opengis.net/def/crs/EPSG/0/28992\", \"http://www.opengis.net/def/crs/EPSG/0/25831\", \"http://www.opengis.net/def/crs/EPSG/0/25832\", \"http://www.opengis.net/def/crs/EPSG/0/25833\" ]\n"
				+ "  }, {\n" + "    \"name\" : \"verwaltungseinheit\",\n"
				+ "    \"title\" : \"Verwaltungseinheit\",\n"
				+ "    \"extent\" : {\n"
				+ "      \"spatial\" : [ 5.61272621360749, 50.2373512077239, 9.58963433710139, 52.5286304537795 ],\n"
				+ "      \"temporal\" : [ \"2018-05-18T14:45:44Z\", \"2019-06-17T21:41:19Z\" ]\n"
				+ "    },\n" + "    \"links\" : [ {\n"
				+ "      \"rel\" : \"item\",\n"
				+ "      \"type\" : \"application/geo+json\",\n"
				+ "      \"title\" : \"Verwaltungseinheit as GeoJSON\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/verwaltungseinheit/items?f=json\"\n"
				+ "    }, {\n" + "      \"rel\" : \"item\",\n"
				+ "      \"type\" : \"application/gml+xml;profile=\\\"http://www.opengis.net/def/profile/ogc/2.0/gml-sf2\\\";version=3.2\",\n"
				+ "      \"title\" : \"Verwaltungseinheit as GML\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/verwaltungseinheit/items?f=xml\"\n"
				+ "    }, {\n" + "      \"rel\" : \"item\",\n"
				+ "      \"type\" : \"text/html\",\n"
				+ "      \"title\" : \"Verwaltungseinheit as HTML\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/verwaltungseinheit/items?f=html\"\n"
				+ "    }, {\n" + "      \"rel\" : \"data\",\n"
				+ "      \"type\" : \"application/json\",\n"
				+ "      \"title\" : \"Information about the Verwaltungseinheit data\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/verwaltungseinheit?f=json\"\n"
				+ "    }, {\n" + "      \"rel\" : \"data\",\n"
				+ "      \"type\" : \"application/gml+xml;profile=\\\\\\\"http://www.opengis.net/def/profile/ogc/2.0/gml-sf2\\\\\\\";version=3.2\",\n"
				+ "      \"title\" : \"Information about the Verwaltungseinheit data\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/verwaltungseinheit?f=xml\"\n"
				+ "    }, {\n" + "      \"rel\" : \"data\",\n"
				+ "      \"type\" : \"text/html\",\n"
				+ "      \"title\" : \"Information about the Verwaltungseinheit data\",\n"
				+ "      \"href\" : \"https://www.ldproxy.nrw.de/kataster/collections/verwaltungseinheit?f=html\"\n"
				+ "    } ],\n"
				+ "    \"crs\" : [ \"http://www.opengis.net/def/crs/EPSG/0/25832\", \"http://www.opengis.net/def/crs/OGC/1.3/CRS84\", \"http://www.opengis.net/def/crs/EPSG/0/3034\", \"http://www.opengis.net/def/crs/EPSG/0/3035\", \"http://www.opengis.net/def/crs/EPSG/0/3043\", \"http://www.opengis.net/def/crs/EPSG/0/3044\", \"http://www.opengis.net/def/crs/EPSG/0/3045\", \"http://www.opengis.net/def/crs/EPSG/0/3857\", \"http://www.opengis.net/def/crs/EPSG/0/4258\", \"http://www.opengis.net/def/crs/EPSG/0/4326\", \"http://www.opengis.net/def/crs/EPSG/0/4647\", \"http://www.opengis.net/def/crs/EPSG/0/5649\", \"http://www.opengis.net/def/crs/EPSG/0/5650\", \"http://www.opengis.net/def/crs/EPSG/0/5651\", \"http://www.opengis.net/def/crs/EPSG/0/5652\", \"http://www.opengis.net/def/crs/EPSG/0/5653\", \"http://www.opengis.net/def/crs/EPSG/0/28992\", \"http://www.opengis.net/def/crs/EPSG/0/25831\", \"http://www.opengis.net/def/crs/EPSG/0/25832\", \"http://www.opengis.net/def/crs/EPSG/0/25833\" ]\n"
				+ "  } ]\n" + "}";
		Content content = WfsFeaturesConverter.toContent(contentValue);
		TestCase.assertNotNull(content);

	}

	@Test
	public void testCollectionInfo() {

		String content = "  {\n" + "  \"name\": \"buildings\",\n"
				+ "  \"title\": \"Buildings\",\n"
				+ "  \"description\": \"Buildings in the city of Bonn.\",\n"
				+ "  \"extent\": {\n"
				+ "  \"spatial\": [ 7.01, 50.63, 7.22, 50.78 ],\n"
				+ "  \"temporal\": [ \"2010-02-15T12:34:56Z\", \"2018-03-18T12:11:00Z\" ]\n"
				+ "  },\n" + "  \"links\": [\n"
				+ "  { \"href\": \"http://data.example.org/collections/buildings/items\",\n"
				+ "  \"rel\": \"item\", \"type\": \"application/geo+json\",\n"
				+ "  \"title\": \"Buildings\" },\n"
				+ "  { \"href\": \"http://example.org/concepts/building.html\",\n"
				+ "  \"rel\": \"describedBy\", \"type\": \"text/html\",\n"
				+ "  \"title\": \"Feature catalogue for buildings\" }\n"
				+ "  ] }";
		CollectionInfo collectionInfo = WfsFeaturesConverter
				.toCollectionInfo(content);
		TestCase.assertNotNull(collectionInfo);
		TestCase.assertEquals("buildings", collectionInfo.getName());
		TestCase.assertEquals("Buildings", collectionInfo.getTitle());
		TestCase.assertEquals("Buildings in the city of Bonn.",
				collectionInfo.getDescription());
		Extent extent = collectionInfo.getExtent();
		TestCase.assertNotNull(extent);
		TestCase.assertEquals(4, extent.getSpatial().size());
		TestCase.assertEquals(7.01, extent.getSpatial().get(0));
		TestCase.assertEquals(50.63, extent.getSpatial().get(1));
		TestCase.assertEquals(7.22, extent.getSpatial().get(2));
		TestCase.assertEquals(50.78, extent.getSpatial().get(3));
		TestCase.assertEquals(2, extent.getTemporal().size());
		TestCase.assertEquals("2010-02-15T12:34:56Z",
				extent.getTemporal().get(0));
		TestCase.assertEquals("2018-03-18T12:11:00Z",
				extent.getTemporal().get(1));
		List<Link> links = collectionInfo.getLinks();
		TestCase.assertNotNull(extent);
		TestCase.assertEquals(2, links.size());
		TestCase.assertEquals(
				"http://data.example.org/collections/buildings/items",
				links.get(0).getHref());
		TestCase.assertEquals("item", links.get(0).getRel());
		TestCase.assertEquals("http://example.org/concepts/building.html",
				links.get(1).getHref());
		TestCase.assertEquals("describedBy", links.get(1).getRel());

	}

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
		WfsFeatureCollection featureCollection = WfsFeaturesConverter
				.toFeatureCollection(content);
		TestCase.assertNotNull(featureCollection);
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
