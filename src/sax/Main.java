package sax;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = new File("D:/Универ/5 семестр/стрweb/laba3/src/books.xml").getAbsolutePath();
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            BookXMLHandler handler = new BookXMLHandler();
            parser.parse(new File(path), handler);
        } catch (IOException x) {
            System.err.println(x);
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }

}
