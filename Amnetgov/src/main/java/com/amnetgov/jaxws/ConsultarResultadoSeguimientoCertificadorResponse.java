
package com.amnetgov.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.5
 * Tue Apr 12 18:21:06 IDT 2016
 * Generated source version: 3.0.5
 */

@XmlRootElement(name = "ConsultarResultadoSeguimientoCertificadorResponse", namespace = "http://amnetgov.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarResultadoSeguimientoCertificadorResponse", namespace = "http://amnetgov.com/")

public class ConsultarResultadoSeguimientoCertificadorResponse {

    @XmlElement(name = "ConsultarResultadoSeguimientoCertificadorResult", namespace = "http://amnetgov.com/")
    private com.amnetgov.ConsultarResultadoSeguimientoCertificadorResultado ConsultarResultadoSeguimientoCertificadorResult;

    public com.amnetgov.ConsultarResultadoSeguimientoCertificadorResultado getConsultarResultadoSeguimientoCertificadorResult() {
        return this.ConsultarResultadoSeguimientoCertificadorResult;
    }

    public void setConsultarResultadoSeguimientoCertificadorResult(com.amnetgov.ConsultarResultadoSeguimientoCertificadorResultado newConsultarResultadoSeguimientoCertificadorResult)  {
        this.ConsultarResultadoSeguimientoCertificadorResult = newConsultarResultadoSeguimientoCertificadorResult;
    }

}
