/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.ceutec.vanguardia.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juanc
 */
@Entity
@Table(name = "CALENDARIOHABITACIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calendariohabitaciones.findAll", query = "SELECT c FROM Calendariohabitaciones c")
    , @NamedQuery(name = "Calendariohabitaciones.findById", query = "SELECT c FROM Calendariohabitaciones c WHERE c.id = :id")
    , @NamedQuery(name = "Calendariohabitaciones.findByFecha", query = "SELECT c FROM Calendariohabitaciones c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Calendariohabitaciones.findByEstado", query = "SELECT c FROM Calendariohabitaciones c WHERE c.estado = :estado")})
public class Calendariohabitaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "ESTADO")
    private BigInteger estado;
    @JoinColumn(name = "IDHABITACION", referencedColumnName = "ID")
    @ManyToOne
    private Habitaciones idhabitacion;

    public Calendariohabitaciones() {
    }

    public Calendariohabitaciones(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigInteger getEstado() {
        return estado;
    }

    public void setEstado(BigInteger estado) {
        this.estado = estado;
    }

    public Habitaciones getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(Habitaciones idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calendariohabitaciones)) {
            return false;
        }
        Calendariohabitaciones other = (Calendariohabitaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Calendariohabitaciones[ id=" + id + " ]";
    }
    
}
