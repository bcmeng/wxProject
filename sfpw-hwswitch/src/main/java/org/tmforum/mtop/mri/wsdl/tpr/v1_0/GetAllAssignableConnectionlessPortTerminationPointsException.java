
package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:30.921+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getAllAssignableConnectionlessPortTerminationPointsException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tpr/v1")
public class GetAllAssignableConnectionlessPortTerminationPointsException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tpr.v1.GetAllAssignableConnectionlessPortTerminationPointsException getAllAssignableConnectionlessPortTerminationPointsException;

    public GetAllAssignableConnectionlessPortTerminationPointsException() {
        super();
    }
    
    public GetAllAssignableConnectionlessPortTerminationPointsException(String message) {
        super(message);
    }
    
    public GetAllAssignableConnectionlessPortTerminationPointsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetAllAssignableConnectionlessPortTerminationPointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetAllAssignableConnectionlessPortTerminationPointsException getAllAssignableConnectionlessPortTerminationPointsException) {
        super(message);
        this.getAllAssignableConnectionlessPortTerminationPointsException = getAllAssignableConnectionlessPortTerminationPointsException;
    }

    public GetAllAssignableConnectionlessPortTerminationPointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetAllAssignableConnectionlessPortTerminationPointsException getAllAssignableConnectionlessPortTerminationPointsException, Throwable cause) {
        super(message, cause);
        this.getAllAssignableConnectionlessPortTerminationPointsException = getAllAssignableConnectionlessPortTerminationPointsException;
    }

    public org.tmforum.mtop.mri.xsd.tpr.v1.GetAllAssignableConnectionlessPortTerminationPointsException getFaultInfo() {
        return this.getAllAssignableConnectionlessPortTerminationPointsException;
    }
}