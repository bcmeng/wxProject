
package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:30.453+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getTerminationPointPoolException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tpr/v1")
public class GetTerminationPointPoolException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tpr.v1.GetTerminationPointPoolException getTerminationPointPoolException;

    public GetTerminationPointPoolException() {
        super();
    }
    
    public GetTerminationPointPoolException(String message) {
        super(message);
    }
    
    public GetTerminationPointPoolException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetTerminationPointPoolException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetTerminationPointPoolException getTerminationPointPoolException) {
        super(message);
        this.getTerminationPointPoolException = getTerminationPointPoolException;
    }

    public GetTerminationPointPoolException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetTerminationPointPoolException getTerminationPointPoolException, Throwable cause) {
        super(message, cause);
        this.getTerminationPointPoolException = getTerminationPointPoolException;
    }

    public org.tmforum.mtop.mri.xsd.tpr.v1.GetTerminationPointPoolException getFaultInfo() {
        return this.getTerminationPointPoolException;
    }
}