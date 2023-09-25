import Target.Target;
import adaptee.Data;
import adaptee.DataCSV;
import adaptee.DataXML;
import adaptee.DataYAML;
import adapter.AdapterCSV;
import adapter.AdapterXML;
import adapter.AdapterYAML;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        String xml = new DataXML().getData();
        String csv = new DataCSV().getData();
        String yaml = new DataYAML().getData();

        Target adapterXML = new AdapterXML();
        Target adapterCSV = new AdapterCSV();
        Target adapterYAML = new AdapterYAML();

        System.out.println("========== XML ==========");
        System.out.println(xml);
        System.out.println("========== CSV ==========");
        System.out.println(csv);
        System.out.println("========== YAML ==========");
        System.out.println(yaml);

        System.out.println("========== RESULT ==========");
        String xmlToJson = adapterXML.getJson(xml);
        System.out.println(xmlToJson);
        String csvToJson = adapterCSV.getJson(csv);
        System.out.println(csvToJson);
        String yamlToJson = adapterYAML.getJson(yaml);
        System.out.println(yamlToJson);

    }
}