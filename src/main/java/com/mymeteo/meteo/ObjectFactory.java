
package com.mymeteo.meteo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mymeteo.meteo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Releve_QNAME = new QName("http://www.mymeteo.com/meteo", "releve");
    private final static QName _Lieu_QNAME = new QName("http://www.mymeteo.com/meteo", "lieu");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mymeteo.meteo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Lieu }
     * 
     */
    public Lieu createLieu() {
        return new Lieu();
    }

    /**
     * Create an instance of {@link Releve }
     * 
     */
    public Releve createReleve() {
        return new Releve();
    }

    /**
     * Create an instance of {@link Temperature }
     * 
     */
    public Temperature createTemperature() {
        return new Temperature();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mymeteo.com/meteo", name = "releve")
    public JAXBElement<Releve> createReleve(Releve value) {
        return new JAXBElement<Releve>(_Releve_QNAME, Releve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lieu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mymeteo.com/meteo", name = "lieu")
    public JAXBElement<Lieu> createLieu(Lieu value) {
        return new JAXBElement<Lieu>(_Lieu_QNAME, Lieu.class, null, value);
    }

}
