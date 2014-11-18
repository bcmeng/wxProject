package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:31.125+08:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "TerminationPointRetrievalHttp", 
                  wsdlLocation = "http://192.168.189.46:9997/TerminationPointRetrieval?wsdl",
                  targetNamespace = "http://www.tmforum.org/mtop/mri/wsdl/tpr/v1-0") 
public class TerminationPointRetrievalHttp extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.tmforum.org/mtop/mri/wsdl/tpr/v1-0", "TerminationPointRetrievalHttp");
    public final static QName TerminationPointRetrievalRPC = new QName("http://www.tmforum.org/mtop/mri/wsdl/tpr/v1-0", "TerminationPointRetrieval_RPC");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.189.46:9997/TerminationPointRetrieval?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TerminationPointRetrievalHttp.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.189.46:9997/TerminationPointRetrieval?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TerminationPointRetrievalHttp(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TerminationPointRetrievalHttp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TerminationPointRetrievalHttp() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns TerminationPointRetrievalRPC
     */
    @WebEndpoint(name = "TerminationPointRetrieval_RPC")
    public TerminationPointRetrievalRPC getTerminationPointRetrievalRPC() {
        return super.getPort(TerminationPointRetrievalRPC, TerminationPointRetrievalRPC.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TerminationPointRetrievalRPC
     */
    @WebEndpoint(name = "TerminationPointRetrieval_RPC")
    public TerminationPointRetrievalRPC getTerminationPointRetrievalRPC(WebServiceFeature... features) {
        return super.getPort(TerminationPointRetrievalRPC, TerminationPointRetrievalRPC.class, features);
    }

}