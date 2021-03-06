//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.10 at 07:51:31 PM EET 
//


package soap.clientregix.requests.grao.nbd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bg.government.regixclient.requests package. 
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

    private final static QName _PersonDataRequest_QNAME = new QName("http://egov.bg/RegiX/GRAO/NBD/PersonDataRequest", "PersonDataRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bg.government.regixclient.requests
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonDataRequest }
     * 
     */
    public PersonDataRequest createPersonDataRequestType() {
        return new PersonDataRequest();
    }

    /**
     * Create an instance of {@link PersonNames }
     * 
     */
    public PersonNames createPersonNames() {
        return new PersonNames();
    }

    /**
     * Create an instance of {@link Gender }
     * 
     */
    public Gender createGender() {
        return new Gender();
    }

    /**
     * Create an instance of {@link PersonRelationType }
     * 
     */
    public PersonRelationType createPersonRelationType() {
        return new PersonRelationType();
    }

    /**
     * Create an instance of {@link Nationality }
     * 
     */
    public Nationality createNationality() {
        return new Nationality();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonDataRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://egov.bg/RegiX/GRAO/NBD/PersonDataRequest", name = "PersonDataRequest")
    public JAXBElement<PersonDataRequest> createPersonDataRequest(PersonDataRequest value) {
        return new JAXBElement<PersonDataRequest>(_PersonDataRequest_QNAME, PersonDataRequest.class, null, value);
    }

}
