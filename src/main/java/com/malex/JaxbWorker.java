package com.malex;

import com.malex.entity.Student;

/**
 * http://javadevblog.com/primer-raboty-s-jaxb-sohranyaem-java-ob-ekt-v-xml-vosstanavlivaem-ob-ekt-iz-xml.html
 */
public interface JaxbWorker {

    Student fromXmlToObject(String filePath);

    void convertObjectToXml(Student student, String filePath);

}
