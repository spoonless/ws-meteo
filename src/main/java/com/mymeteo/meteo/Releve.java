
package com.mymeteo.meteo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for releve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="releve">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="temperature" type="{http://www.mymeteo.com/meteo}temperature"/>
 *         &lt;element name="lieu" type="{http://www.mymeteo.com/meteo}lieu"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "releve", propOrder = {
    "temperature",
    "lieu"
})
public class Releve {

    @XmlElement(required = true)
    protected Temperature temperature;
    @XmlElement(required = true)
    protected Lieu lieu;

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setTemperature(Temperature value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the lieu property.
     * 
     * @return
     *     possible object is
     *     {@link Lieu }
     *     
     */
    public Lieu getLieu() {
        return lieu;
    }

    /**
     * Sets the value of the lieu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lieu }
     *     
     */
    public void setLieu(Lieu value) {
        this.lieu = value;
    }

}
