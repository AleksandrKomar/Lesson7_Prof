package hometasks.task3;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        SAXPars saxp = new SAXPars();

        String path = "C:\\Users\\ALexPC\\IdeaProjects\\Lesson7_Prof\\src\\hometasks\\task3\\home3.xml";

        parser.parse(new File(path), saxp);


    }

}

