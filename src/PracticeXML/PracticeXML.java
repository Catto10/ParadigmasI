package PracticeXML;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class PracticeXML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();

            DocumentBuilder builer= factory.newDocumentBuilder();
            DOMImplementation implementation = builer.getDOMImplementation();

            Document documento=implementation.createDocument(null,"Concesionario",null);
            documento.setXmlVersion("1.0");

            Element Practice = documento.createElement("Practice");
            Element CV= documento.createElement("CV");

            Element name =documento.createElement("Name");
            Text textName= documento.createTextNode("Luis Enrique");
            name.appendChild(textName);
            CV.appendChild(name);

            Element ppfil =documento.createElement("professionalprofile");
            Text textPpfil= documento.createTextNode("Computer Engineer");
            ppfil.appendChild(textPpfil);
            CV.appendChild(ppfil);

            Element wexper =documento.createElement("Workexperiencie");
            Text textWexper= documento.createTextNode("cyber stuart 2018 in San Jose");
            wexper.appendChild(textWexper);
            CV.appendChild(wexper);

            Element acafotn =documento.createElement("Academicformation");
            Text textAcafotn= documento.createTextNode("Computer Engineering at CU UAEM Atlacomulco from 2020 to today");
            acafotn.appendChild(textAcafotn);
            CV.appendChild(acafotn);

            Element contact =documento.createElement("Contact");
            Text textContact= documento.createTextNode("Number: 5529131528" +
                    "e-mail: luisenriquediazcatarino@gmail.com");
            contact.appendChild(textContact);
            CV.appendChild(contact);

            Element languaje =documento.createElement("languaje");
            Text textLenguaje= documento.createTextNode("English 10%" +
                    "Spanish 100% ");
            languaje.appendChild(textLenguaje);
            CV.appendChild(languaje);

            Practice.appendChild(CV);

            documento.getDocumentElement().appendChild(Practice);

            Source sourse= new DOMSource(documento);
            Result result = new StreamResult(new File("concesionario.xml"));

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(sourse,result);



        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }



    }
}
