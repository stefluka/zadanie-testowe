//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.13 at 05:07:38 PM CEST 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _Flota_QNAME = new QName("", "flota");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Flota }
     * 
     */
    public Flota createFlota() {
        return new Flota();
    }

    /**
     * Create an instance of {@link Pojazd }
     * 
     */
    public Pojazd createPojazd() {
        return new Pojazd();
    }

    /**
     * Create an instance of {@link PozycjeWyposazenia }
     * 
     */
    public PozycjeWyposazenia createPozycjeWyposazenia() {
        return new PozycjeWyposazenia();
    }

    /**
     * Create an instance of {@link TypLakieru }
     * 
     */
    public TypLakieru createTypLakieru() {
        return new TypLakieru();
    }

    /**
     * Create an instance of {@link Silnik }
     * 
     */
    public Silnik createSilnik() {
        return new Silnik();
    }

    /**
     * Create an instance of {@link PozycjaWyposazenia }
     * 
     */
    public PozycjaWyposazenia createPozycjaWyposazenia() {
        return new PozycjaWyposazenia();
    }

    /**
     * Create an instance of {@link Kierowca }
     * 
     */
    public Kierowca createKierowca() {
        return new Kierowca();
    }

    /**
     * Create an instance of {@link TypPojazdu }
     * 
     */
    public TypPojazdu createTypPojazdu() {
        return new TypPojazdu();
    }

    /**
     * Create an instance of {@link KierowcyPojazdy }
     * 
     */
    public KierowcyPojazdy createKierowcyPojazdy() {
        return new KierowcyPojazdy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Flota }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "flota")
    public JAXBElement<Flota> createFlota(Flota value) {
        return new JAXBElement<Flota>(_Flota_QNAME, Flota.class, null, value);
    }

}
