
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

@XmlRootElement(name = "RegistroReporteFavorable", namespace = "http://amnetgov.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroReporteFavorable", namespace = "http://amnetgov.com/", propOrder = {"UsuarioServicio", "ContrasenaServicio", "IdSeguimiento", "NombreReporte", "Reporte"})

public class RegistroReporteFavorable {

    @XmlElement(name = "UsuarioServicio", namespace = "http://amnetgov.com/")
    private java.lang.String UsuarioServicio;
    @XmlElement(name = "ContrasenaServicio", namespace = "http://amnetgov.com/")
    private java.lang.String ContrasenaServicio;
    @XmlElement(name = "IdSeguimiento", namespace = "http://amnetgov.com/")
    private java.lang.String IdSeguimiento;
    @XmlElement(name = "NombreReporte", namespace = "http://amnetgov.com/")
    private java.lang.String NombreReporte;
    @XmlElement(name = "Reporte", namespace = "http://amnetgov.com/")
    private byte[] Reporte;

    public java.lang.String getUsuarioServicio() {
        return this.UsuarioServicio;
    }

    public void setUsuarioServicio(java.lang.String newUsuarioServicio)  {
        this.UsuarioServicio = newUsuarioServicio;
    }

    public java.lang.String getContrasenaServicio() {
        return this.ContrasenaServicio;
    }

    public void setContrasenaServicio(java.lang.String newContrasenaServicio)  {
        this.ContrasenaServicio = newContrasenaServicio;
    }

    public java.lang.String getIdSeguimiento() {
        return this.IdSeguimiento;
    }

    public void setIdSeguimiento(java.lang.String newIdSeguimiento)  {
        this.IdSeguimiento = newIdSeguimiento;
    }

    public java.lang.String getNombreReporte() {
        return this.NombreReporte;
    }

    public void setNombreReporte(java.lang.String newNombreReporte)  {
        this.NombreReporte = newNombreReporte;
    }

    public byte[] getReporte() {
        return this.Reporte;
    }

    public void setReporte(byte[] newReporte)  {
        this.Reporte = newReporte;
    }

}
