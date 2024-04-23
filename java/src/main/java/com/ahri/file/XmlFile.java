/**
 * Java XML file parse
 */

package com.ahri.file;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.nio.file.Path;
import java.nio.file.Paths;

public class XmlFile {
    public static void main(String[] args) {
        Path xml_file = Paths.get(System.getProperty("user.dir") + "/data/Ahri/Ahri.xml").toAbsolutePath();
        System.out.println(xml_file);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xml_file.toString());
            Element root = document.getDocumentElement();

        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
