
package com.w3schools.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CelsiusToFahrenheitResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "celsiusToFahrenheitResult"
})
@XmlRootElement(name = "CelsiusToFahrenheitResponse")
public class CelsiusToFahrenheitResponse {

    @XmlElement(name = "CelsiusToFahrenheitResult")
    protected String celsiusToFahrenheitResult;

    /**
     * Obtient la valeur de la propri�t� celsiusToFahrenheitResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelsiusToFahrenheitResult() {
        return celsiusToFahrenheitResult;
    }

    /**
     * D�finit la valeur de la propri�t� celsiusToFahrenheitResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelsiusToFahrenheitResult(String value) {
        this.celsiusToFahrenheitResult = value;
    }

}
