package deseriallizare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        try {
            /*
        BufferedReader reader;
        File file = new File ("src/main/resources/classe.xml");
        String line;
        try {
            
            reader = new BufferedReader(new FileReader(file));
            line = reader.readLine();

            


            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        XmlMapper xmlMapper = new XmlMapper();
        
            SimpleBean value = xmlMapper.readValue(line, SimpleBean.class);
        } catch (JsonMappingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public String deserializzare(String line, String tag){
        
        int st = line.indexOf("<"+tag+">");
        int fn = line.indexOf("</"+tag+">");
        String content = line.substring(st+tag.length()+2,fn);
        if(content.contains("<element>")){

        }
        return content;
    }
}
