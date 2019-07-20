
package com.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws package. 
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

    private final static QName _GeneralAverage_QNAME = new QName("http://ws.com/", "generalAverage");
    private final static QName _GeneralAverageResponse_QNAME = new QName("http://ws.com/", "generalAverageResponse");
    private final static QName _AvCourse_QNAME = new QName("http://ws.com/", "avCourse");
    private final static QName _AvCourseResponse_QNAME = new QName("http://ws.com/", "avCourseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeneralAverageResponse }
     * 
     */
    public GeneralAverageResponse createGeneralAverageResponse() {
        return new GeneralAverageResponse();
    }

    /**
     * Create an instance of {@link AvCourseResponse }
     * 
     */
    public AvCourseResponse createAvCourseResponse() {
        return new AvCourseResponse();
    }

    /**
     * Create an instance of {@link AvCourse }
     * 
     */
    public AvCourse createAvCourse() {
        return new AvCourse();
    }

    /**
     * Create an instance of {@link GeneralAverage }
     * 
     */
    public GeneralAverage createGeneralAverage() {
        return new GeneralAverage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralAverage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "generalAverage")
    public JAXBElement<GeneralAverage> createGeneralAverage(GeneralAverage value) {
        return new JAXBElement<GeneralAverage>(_GeneralAverage_QNAME, GeneralAverage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralAverageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "generalAverageResponse")
    public JAXBElement<GeneralAverageResponse> createGeneralAverageResponse(GeneralAverageResponse value) {
        return new JAXBElement<GeneralAverageResponse>(_GeneralAverageResponse_QNAME, GeneralAverageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvCourse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "avCourse")
    public JAXBElement<AvCourse> createAvCourse(AvCourse value) {
        return new JAXBElement<AvCourse>(_AvCourse_QNAME, AvCourse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvCourseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.com/", name = "avCourseResponse")
    public JAXBElement<AvCourseResponse> createAvCourseResponse(AvCourseResponse value) {
        return new JAXBElement<AvCourseResponse>(_AvCourseResponse_QNAME, AvCourseResponse.class, null, value);
    }

}
