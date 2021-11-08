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
@Table(name = "SERVICIOSRESERVAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Serviciosreservas.findAll", query = "SELECT s FROM Serviciosreservas s")
    , @NamedQuery(name = "Serviciosreservas.findById", query = "SELECT s FROM Serviciosreservas s WHERE s.id = :id")
    , @NamedQuery(name = "Serviciosreservas.findByPrecio", query = "SELECT s FROM Serviciosreservas s WHERE s.precio = :precio")
    , @NamedQuery(name = "Serviciosreservas.findByFecha", query = "SELECT s FROM Serviciosreservas s WHERE s.fecha = :fecha")})
public class Serviciosreservas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "PRECIO")
    private BigInteger precio;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "IDDESCUENTO", referencedColumnName = "ID")
    @ManyToOne
    private Descuentos iddescuento;
    @JoinColumn(name = "IDPROMOCION", referencedColumnName = "ID")
    @ManyToOne
    private Promociones idpromocion;
    @JoinColumn(name = "IDRESERVA", referencedColumnName = "ID")
    @ManyToOne
    private Reservas idreserva;
    @JoinColumn(name = "IDSERVICIO", referencedColumnName = "ID")
    @ManyToOne
    private Servicios idservicio;

    public Serviciosreservas() {
    }

    public Serviciosreservas(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Descuentos getIddescuento() {
        return iddescuento;
    }

    public void setIddescuento(Descuentos iddescuento) {
        this.iddescuento = iddescuento;
    }

    public Promociones getIdpromocion() {
        return idpromocion;
    }

    public void setIdpromocion(Promociones idpromocion) {
        this.idpromocion = idpromocion;
    }

    public Reservas getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Reservas idreserva) {
        this.idreserva = idreserva;
    }

    public Servicios getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(Servicios idservicio) {
        this.idservicio = idservicio;
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
        if (!(object instanceof Serviciosreservas)) {
            return false;
        }
        Serviciosreservas other = (Serviciosreservas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Serviciosreservas[ id=" + id + " ]";
    }
    
}
