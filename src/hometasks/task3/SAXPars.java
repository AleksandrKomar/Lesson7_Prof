package hometasks.task3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class SAXPars extends DefaultHandler {

    ArrayList list = new ArrayList<>();

    Doctors doc = null;
    String thisElement = "";

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parse XML...");
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        thisElement = qName;

        if (qName.equals("doc")) {
            doc = new Doctors();
        }
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        thisElement = "";

        if (qName.equals("doc")) {

            list.add(doc);
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (thisElement.equals("id")) {
            doc.setId(Integer.parseInt((new String(ch, start, length))));
        }
        if (thisElement.equals("fam")) {
            doc.setFam(new String(ch, start, length));
        }
        if (thisElement.equals("name")) {
            doc.setName(new String(ch, start, length));
        }
        if (thisElement.equals("otc")) {
            doc.setOtc(new String(ch, start, length));
        }
        if (thisElement.equals("dateb")) {
            doc.setDateb(new String(ch, start, length));
        }
        if (thisElement.equals("datep")) {
            doc.setDatep(new String(ch, start, length));
        }
        if (thisElement.equals("datev")) {
            doc.setDatev(new String(ch, start, length));
        }
        if (thisElement.equals("datebegin")) {
            doc.setDatebegin(new String(ch, start, length));
        }
        if (thisElement.equals("dateend")) {
            doc.setDateend(new String(ch, start, length));
        }
        if (thisElement.equals("vdolid")) {
            doc.setVdolid(Integer.valueOf(new String(ch, start, length)));
        }
        if (thisElement.equals("specid")) {
            doc.setSpecid(Integer.valueOf(new String(ch, start, length)));
        }
        if (thisElement.equals("klavid")) {
            doc.setKlavid(Integer.valueOf(new String(ch, start, length)));
        }
        if (thisElement.equals("stav")) {
            doc.setStav(Float.valueOf((new String(ch, start, length))));
        }
        if (thisElement.equals("progid")) {
            doc.setProgid(Integer.valueOf(new String(ch, start, length)));
        }
    }

    @Override
    public void endDocument() {

        for (Object d : list) {
            System.out.println(d);
        }

        System.out.println("Stop parse XML...");
    }
}