package deseriallizare;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        File file = new File("src/main/resources/classe.xml");

        //deserializzazione xml
        root xml = DeserializeXML(file);
        System.out.println(xml);
        
        //serializzazione xml
        String sxml = SerializeXML(xml);
        System.out.println('\n' + sxml);

        //serializzazione json
        String sjson = SerializeJSON(xml);        
        System.out.println(sjson + '\n');

        //creazione file json
        File file2 = new File("src/main/resources/classe.json");
        file2.createNewFile();
        PrintWriter pw = new PrintWriter(file2);
        pw.write(sjson);
        pw.close();

        //deserializzare json
        root json = DeserializeJSON(file2);
        System.out.println(json);

    }

    public static String SerializeXML(root value) throws JsonProcessingException{
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
        String xml = xmlMapper.writeValueAsString(value);
        return xml;
            
    }

    public static root DeserializeXML(File file) throws StreamReadException, DatabindException, IOException{
        XmlMapper xmlMapper = new XmlMapper();
        root object = xmlMapper.readValue(file, root.class);
        return object;
    }

    public static String SerializeJSON(root value) throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(value);
        return json;
            
    }

    public static root DeserializeJSON(File file) throws StreamReadException, DatabindException, IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        root object = objectMapper.readValue(file, root.class);
        return object;
    }
}

