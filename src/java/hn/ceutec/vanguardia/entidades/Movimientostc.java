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
@Table(name = "MOVIMIENTOSTC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimientostc.findAll", query = "SELECT m FROM Movimientostc m")
    , @NamedQuery(name = "Movimientostc.findById", query = "SELECT m FROM Movimientostc m WHERE m.id = :id")
    , @NamedQuery(name = "Movimientostc.findByNumerotc", query = "SELECT m FROM Movimientostc m WHERE m.numerotc = :numerotc")
    , @NamedQuery(name = "Movimientostc.findByFecha", query = "SELECT m FROM Movimientostc m WHERE m.fecha = :fecha")
    , @NamedQuery(name = "Movimientostc.findByMonto", query = "SELECT m FROM Movimientostc m WHERE m.monto = :monto")
    , @NamedQuery(name = "Movimientostc.findByEstado", query = "SELECT m FROM Movimientostc m WHERE m.estado = :estado")})
public class Movimientostc implements Serializable {

    @Column(name = "CONFIRMACION")
    private BigInteger confirmacion;

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "NUMEROTC")
    private String numerotc;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "MONTO")
    private BigInteger monto;
    @Column(name = "ESTADO")
    private BigInteger estado;
    @JoinColumn(name = "IDFACTURA", referencedColumnName = "ID")
    @ManyToOne
    private Facturareserva idfactura;

    public Movimientostc() {
    }

    public Movimientostc(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNumerotc() {
        return numerotc;
    }

    public void setNumerotc(String numerotc) {
        this.numerotc = numerotc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigInteger getMonto() {
        return monto;
    }

    public void setMonto(BigInteger monto) {
        this.monto = monto;
    }

    public BigInteger getEstado() {
        return estado;
    }

    public void setEstado(BigInteger estado) {
        this.estado = estado;
    }

    public Facturareserva getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Facturareserva idfactura) {
        this.idfactura = idfactura;
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
        if (!(object instanceof Movimientostc)) {
            return false;
        }
        Movimientostc other = (Movimientostc) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Movimientostc[ id=" + id + " ]";
    }

    public BigInteger getConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(BigInteger confirmacion) {
        this.confirmacion = confirmacion;
    }
    
}
