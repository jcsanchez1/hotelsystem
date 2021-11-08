/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.ceutec.vanguardia.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author juanc
 */
@Entity
@Table(name = "SERVICIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicios.findAll", query = "SELECT s FROM Servicios s")
    , @NamedQuery(name = "Servicios.findById", query = "SELECT s FROM Servicios s WHERE s.id = :id")
    , @NamedQuery(name = "Servicios.findByServicio", query = "SELECT s FROM Servicios s WHERE s.servicio = :servicio")
    , @NamedQuery(name = "Servicios.findByPrecio", query = "SELECT s FROM Servicios s WHERE s.precio = :precio")
    , @NamedQuery(name = "Servicios.findByIdtipohabitacion", query = "SELECT s FROM Servicios s WHERE s.idtipohabitacion = :idtipohabitacion")})
public class Servicios implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "PRECIO")
    private BigInteger precio;
    @Basic(optional = false)
    @Column(name = "IDTIPOHABITACION")
    private BigInteger idtipohabitacion;
    @OneToMany(mappedBy = "idservicio")
    private List<Serviciosreservas> serviciosreservasList;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Tipohabitacion tipohabitacion;

    public Servicios() {
    }

    public Servicios(BigDecimal id) {
        this.id = id;
    }

    public Servicios(BigDecimal id, BigInteger idtipohabitacion) {
        this.id = id;
        this.idtipohabitacion = idtipohabitacion;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public BigInteger getIdtipohabitacion() {
        return idtipohabitacion;
    }

    public void setIdtipohabitacion(BigInteger idtipohabitacion) {
        this.idtipohabitacion = idtipohabitacion;
    }

    @XmlTransient
    public List<Serviciosreservas> getServiciosreservasList() {
        return serviciosreservasList;
    }

    public void setServiciosreservasList(List<Serviciosreservas> serviciosreservasList) {
        this.serviciosreservasList = serviciosreservasList;
    }

    public Tipohabitacion getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(Tipohabitacion tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
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
        if (!(object instanceof Servicios)) {
            return false;
        }
        Servicios other = (Servicios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Servicios[ id=" + id + " ]";
    }
    
}
