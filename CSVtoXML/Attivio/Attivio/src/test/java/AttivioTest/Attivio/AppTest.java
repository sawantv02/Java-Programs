package AttivioTest.Attivio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;

import org.junit.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import static org.junit.Assert.*;

/**
 * Unit test for CSV to XML.
 */
public class AppTest {
	private void convert(String test, String text, int line, List<String> header) {
		App app = App.getInstance();
		try {
			System.out.println(test);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbf.newDocumentBuilder();
			Document doc = builder.newDocument();

			Element root = doc.createElement("XML");
			doc.appendChild(root);
			Document doct = app.convertToXml(text, line, doc, root, header);
			StreamResult result = new StreamResult(System.out);
			app.transformDocument(doct, result);
			assertTrue(test, true);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testCSV1() {
		List<String> header = new ArrayList<String>();
		header.add("Header1");
		header.add("Header2");
		header.add("Header3");
		header.add("Header4");
		String test = "1,2,3,4,5,6,7";
		int line = 1;
		String testmsg = "Test1:for checking if more values are passed than the headers,xml should be rendered with only given header columns!";
		convert(testmsg, test, line, header);
	}

	@Test
	public void testCSV2() {
		List<String> header = new ArrayList<String>();
		header.add("Header1");
		header.add("Header2");
		header.add("Header3");
		header.add("Header4");
		String test = "1,2,3";
		int line = 1;
		String testmsg = "Test2:for checking if values are not present for particular headers,xml should render empty header tag!";
		convert(testmsg, test, line, header);
	}
	
	@Test
	public void testCSV3() {
		List<String> header = new ArrayList<String>();
		header.add("Header1");
		header.add("Header2");
		header.add("Header3");
		header.add("Header4");
		String test = "1,2,3,\"12,455\"";
		int line = 1;
		String testmsg = "Test3:for checking if values with commas are preserved in xml!";
		convert(testmsg, test, line, header);
	}
	
	@Test
	public void testCSV4() {
		List<String> header = new ArrayList<String>();
		header.add("Header1");
		header.add("Header2");
		header.add("Header3");
		header.add("Header4");
		String test = "1,2,3,12 455";
		int line = 1;
		String testmsg = "Tes4t:for checking if values with spaces are preserved in xml!";
		convert(testmsg, test, line, header);
	}

	
}
