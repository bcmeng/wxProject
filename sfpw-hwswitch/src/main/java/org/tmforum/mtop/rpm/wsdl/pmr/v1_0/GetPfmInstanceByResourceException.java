
package org.tmforum.mtop.rpm.wsdl.pmr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-14T13:37:25.437+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getPfmInstanceByResourceException", targetNamespace = "http://www.tmforum.org/mtop/rpm/xsd/pmr/v1")
public class GetPfmInstanceByResourceException extends Exception {
    
    private org.tmforum.mtop.rpm.xsd.pmr.v1.GetPfmInstanceByResourceException getPfmInstanceByResourceException;

    public GetPfmInstanceByResourceException() {
        super();
    }
    
    public GetPfmInstanceByResourceException(String message) {
        super(message);
    }
    
    public GetPfmInstanceByResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetPfmInstanceByResourceException(String message, org.tmforum.mtop.rpm.xsd.pmr.v1.GetPfmInstanceByResourceException getPfmInstanceByResourceException) {
        super(message);
        this.getPfmInstanceByResourceException = getPfmInstanceByResourceException;
    }

    public GetPfmInstanceByResourceException(String message, org.tmforum.mtop.rpm.xsd.pmr.v1.GetPfmInstanceByResourceException getPfmInstanceByResourceException, Throwable cause) {
        super(message, cause);
        this.getPfmInstanceByResourceException = getPfmInstanceByResourceException;
    }

    public org.tmforum.mtop.rpm.xsd.pmr.v1.GetPfmInstanceByResourceException getFaultInfo() {
        return this.getPfmInstanceByResourceException;
    }
}