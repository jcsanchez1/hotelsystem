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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "TIPOHABITACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipohabitacion.findAll", query = "SELECT t FROM Tipohabitacion t")
    , @NamedQuery(name = "Tipohabitacion.findById", query = "SELECT t FROM Tipohabitacion t WHERE t.id = :id")
    , @NamedQuery(name = "Tipohabitacion.findByTipohabitacion", query = "SELECT t FROM Tipohabitacion t WHERE t.tipohabitacion = :tipohabitacion")
    , @NamedQuery(name = "Tipohabitacion.findByPrecio", query = "SELECT t FROM Tipohabitacion t WHERE t.precio = :precio")
    , @NamedQuery(name = "Tipohabitacion.findByCondiciones", query = "SELECT t FROM Tipohabitacion t WHERE t.condiciones = :condiciones")})
public class Tipohabitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "TIPOHABITACION")
    private String tipohabitacion;
    @Column(name = "PRECIO")
    private BigInteger precio;
    @Column(name = "CONDICIONES")
    private String condiciones;
    @OneToMany(mappedBy = "idtipohabitacion")
    private List<Promociones> promocionesList;
    @OneToMany(mappedBy = "idtipohabitacion")
    private List<Habitaciones> habitacionesList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tipohabitacion")
    private Servicios servicios;
    @OneToMany(mappedBy = "idtipohabitacion")
    private List<Descuentos> descuentosList;

    public Tipohabitacion() {
    }

    public Tipohabitacion(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(String tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    @XmlTransient
    public List<Promociones> getPromocionesList() {
        return promocionesList;
    }

    public void setPromocionesList(List<Promociones> promocionesList) {
        this.promocionesList = promocionesList;
    }

    @XmlTransient
    public List<Habitaciones> getHabitacionesList() {
        return habitacionesList;
    }

    public void setHabitacionesList(List<Habitaciones> habitacionesList) {
        this.habitacionesList = habitacionesList;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }

    @XmlTransient
    public List<Descuentos> getDescuentosList() {
        return descuentosList;
    }

    public void setDescuentosList(List<Descuentos> descuentosList) {
        this.descuentosList = descuentosList;
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
        if (!(object instanceof Tipohabitacion)) {
            return false;
        }
        Tipohabitacion other = (Tipohabitacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Tipohabitacion[ id=" + id + " ]";
    }
    
}
