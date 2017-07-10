package AttivioTest.Attivio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @author vishakha
 *
 */
public class App {

	private static App instance = new App();

	public static App getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		String fileName = args[0];
		App app = App.getInstance();

		app.readFromFile(fileName);

	}

	public void readFromFile(String filename) {
		try {
			List<String> header = new ArrayList<String>();
			File file = new File(filename);
			BufferedReader reader = null;
			reader = new BufferedReader(new FileReader(file));

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbf.newDocumentBuilder();
			Document doc = builder.newDocument();

			Element root = doc.createElement("XML");
			doc.appendChild(root);
			int line = 0;

			String text = null;
			while ((text = reader.readLine()) != null) {
				doc=convertToXml(text, line, doc, root,header);
				line++;
			}
			StreamResult result = new StreamResult(new File("file.xml"));
//			StreamResult result = new StreamResult(System.out);
			transformDocument(doc,result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Document convertToXml(String text, int line, Document doc, Element root,List<String> header) {

		try {
			String tokens[]=text.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
			String[] rows = new String[tokens.length];
			int index = 0;
			for (String t:tokens) {
				String next = t;
				rows[index++] = next;
			}

			if (line == 0) {
				for (String col : rows) {
					header.add(col);
				}
			} else {
				Element rowElement = doc.createElement("row");
				root.appendChild(rowElement);

				for (int col = 0; col < header.size(); col++) {
					String headerName = header.get(col);
					String value = null;

					if (col < rows.length) {
						value = rows[col];
					} else {
						value = "";
					}

					Element current = doc.createElement(headerName);
					current.appendChild(doc.createTextNode(value));
					rowElement.appendChild(current);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}

	public void transformDocument(Document doc,StreamResult result) {
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

			if(doc.hasChildNodes())
				System.out.println("XML conversion successful!");
			
			DOMSource source = new DOMSource(doc);
			transformer.transform(source, result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
