/**
 * Java XML file parse
 */

package com.ahri.file;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.nio.file.Path;
import java.nio.file.Paths;

public class XmlFile {
    private final Path xml_file = Paths.get(System.getProperty("user.dir") + "/data/Ahri/Ahri.xml").toAbsolutePath();

    public void javaxXml() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xml_file.toString());
            Element root = document.getDocumentElement();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        XmlFile xmlFile = new XmlFile();
        xmlFile.javaxXml();
    }
}
