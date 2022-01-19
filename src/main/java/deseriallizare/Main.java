package deseriallizare;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        File file = new File("src/main/resources/classe.xml");
        System.out.println(file);
        XmlMapper xmlMapper = new XmlMapper();
        root value = xmlMapper.readValue(file, root.class);

        System.out.println("La classe " + value.getClasse() + value.getSpecializzazione() + "si trova nell'aula" + value.getAula().getNome()
                + " ed è composta dai seguenti studenti: ");
        for (int i = 0; i < value.getStudenti().size(); i++) {
            System.out.println("- " + value.getStudenti().get(i).getCognome());
        }
    }
}
