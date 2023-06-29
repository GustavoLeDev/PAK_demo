
package packageClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the packageClient package. 
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

    private final static QName _Produit_QNAME = new QName("http://ExampleSoap.example.com/", "produit");
    private final static QName _ProduitResponse_QNAME = new QName("http://ExampleSoap.example.com/", "produitResponse");
    private final static QName _DivisionResponse_QNAME = new QName("http://ExampleSoap.example.com/", "divisionResponse");
    private final static QName _SommeResponse_QNAME = new QName("http://ExampleSoap.example.com/", "sommeResponse");
    private final static QName _Division_QNAME = new QName("http://ExampleSoap.example.com/", "division");
    private final static QName _Somme_QNAME = new QName("http://ExampleSoap.example.com/", "somme");
    private final static QName _SoustractionResponse_QNAME = new QName("http://ExampleSoap.example.com/", "soustractionResponse");
    private final static QName _Soustraction_QNAME = new QName("http://ExampleSoap.example.com/", "soustraction");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: packageClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link Somme }
     * 
     */
    public Somme createSomme() {
        return new Somme();
    }

    /**
     * Create an instance of {@link SoustractionResponse }
     * 
     */
    public SoustractionResponse createSoustractionResponse() {
        return new SoustractionResponse();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link SommeResponse }
     * 
     */
    public SommeResponse createSommeResponse() {
        return new SommeResponse();
    }

    /**
     * Create an instance of {@link Produit }
     * 
     */
    public Produit createProduit() {
        return new Produit();
    }

    /**
     * Create an instance of {@link ProduitResponse }
     * 
     */
    public ProduitResponse createProduitResponse() {
        return new ProduitResponse();
    }

    /**
     * Create an instance of {@link Soustraction }
     * 
     */
    public Soustraction createSoustraction() {
        return new Soustraction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Produit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ExampleSoap.example.com/", name = "produit")
    public JAXBElement<Produit> createProduit(Produit value) {
        return new JAXBElement<Produit>(_Produit_QNAME, Produit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProduitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ExampleSoap.example.com/", name = "produitResponse")
    public JAXBElement<ProduitResponse> createProduitResponse(ProduitResponse value) {
        return new JAXBElement<ProduitResponse>(_ProduitResponse_QNAME, ProduitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ExampleSoap.example.com/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SommeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ExampleSoap.example.com/", name = "sommeResponse")
    public JAXBElement<SommeResponse> createSommeResponse(SommeResponse value) {
        return new JAXBElement<SommeResponse>(_SommeResponse_QNAME, SommeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ExampleSoap.example.com/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somme }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ExampleSoap.example.com/", name = "somme")
    public JAXBElement<Somme> createSomme(Somme value) {
        return new JAXBElement<Somme>(_Somme_QNAME, Somme.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoustractionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ExampleSoap.example.com/", name = "soustractionResponse")
    public JAXBElement<SoustractionResponse> createSoustractionResponse(SoustractionResponse value) {
        return new JAXBElement<SoustractionResponse>(_SoustractionResponse_QNAME, SoustractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soustraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ExampleSoap.example.com/", name = "soustraction")
    public JAXBElement<Soustraction> createSoustraction(Soustraction value) {
        return new JAXBElement<Soustraction>(_Soustraction_QNAME, Soustraction.class, null, value);
    }

}
