
package org.tmforum.mtop.mri.wsdl.tpr.v1_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-08-19T08:33:30.718+08:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "getAllAssignedConnectionlessPortTerminationPointsException", targetNamespace = "http://www.tmforum.org/mtop/mri/xsd/tpr/v1")
public class GetAllAssignedConnectionlessPortTerminationPointsException extends Exception {
    
    private org.tmforum.mtop.mri.xsd.tpr.v1.GetAllAssignedConnectionlessPortTerminationPointsException getAllAssignedConnectionlessPortTerminationPointsException;

    public GetAllAssignedConnectionlessPortTerminationPointsException() {
        super();
    }
    
    public GetAllAssignedConnectionlessPortTerminationPointsException(String message) {
        super(message);
    }
    
    public GetAllAssignedConnectionlessPortTerminationPointsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetAllAssignedConnectionlessPortTerminationPointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetAllAssignedConnectionlessPortTerminationPointsException getAllAssignedConnectionlessPortTerminationPointsException) {
        super(message);
        this.getAllAssignedConnectionlessPortTerminationPointsException = getAllAssignedConnectionlessPortTerminationPointsException;
    }

    public GetAllAssignedConnectionlessPortTerminationPointsException(String message, org.tmforum.mtop.mri.xsd.tpr.v1.GetAllAssignedConnectionlessPortTerminationPointsException getAllAssignedConnectionlessPortTerminationPointsException, Throwable cause) {
        super(message, cause);
        this.getAllAssignedConnectionlessPortTerminationPointsException = getAllAssignedConnectionlessPortTerminationPointsException;
    }

    public org.tmforum.mtop.mri.xsd.tpr.v1.GetAllAssignedConnectionlessPortTerminationPointsException getFaultInfo() {
        return this.getAllAssignedConnectionlessPortTerminationPointsException;
    }
}