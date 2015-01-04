
package com.mymeteo.meteo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for temperature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="temperature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valeur" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unite">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="celsius"/>
 *               &lt;enumeration value="fahrenheit"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "temperature", propOrder = {
    "valeur",
    "unite"
})
public class Temperature {

    protected double valeur;
    @XmlElement(required = true)
    protected String unite;

    /**
     * Gets the value of the valeur property.
     * 
     */
    public double getValeur() {
        return valeur;
    }

    /**
     * Sets the value of the valeur property.
     * 
     */
    public void setValeur(double value) {
        this.valeur = value;
    }

    /**
     * Gets the value of the unite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnite() {
        return unite;
    }

    /**
     * Sets the value of the unite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnite(String value) {
        this.unite = value;
    }

}
