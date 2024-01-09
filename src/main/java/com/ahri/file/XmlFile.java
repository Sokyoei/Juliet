/**
 * Java XML file parse
 */

package com.ahri.file;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XmlFile {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("");
            Element root = document.getDocumentElement();

        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
