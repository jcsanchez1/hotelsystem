/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.ceutec.vanguardia.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author juanc
 */
@Entity
@Table(name = "HABITACIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Habitaciones.findAll", query = "SELECT h FROM Habitaciones h")
    , @NamedQuery(name = "Habitaciones.findById", query = "SELECT h FROM Habitaciones h WHERE h.id = :id")
    , @NamedQuery(name = "Habitaciones.findByNumerohabitacion", query = "SELECT h FROM Habitaciones h WHERE h.numerohabitacion = :numerohabitacion")
    , @NamedQuery(name = "Habitaciones.findByNombre", query = "SELECT h FROM Habitaciones h WHERE h.nombre = :nombre")
    , @NamedQuery(name = "Habitaciones.findByFoto1", query = "SELECT h FROM Habitaciones h WHERE h.foto1 = :foto1")
    , @NamedQuery(name = "Habitaciones.findByFoto2", query = "SELECT h FROM Habitaciones h WHERE h.foto2 = :foto2")
    , @NamedQuery(name = "Habitaciones.findByFoto3", query = "SELECT h FROM Habitaciones h WHERE h.foto3 = :foto3")})
public class Habitaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "NUMEROHABITACION")
    private String numerohabitacion;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "FOTO1")
    private String foto1;
    @Column(name = "FOTO2")
    private String foto2;
    @Column(name = "FOTO3")
    private String foto3;
    @OneToMany(mappedBy = "idhabitacion")
    private List<Calendariohabitaciones> calendariohabitacionesList;
    @JoinColumn(name = "IDESTADO", referencedColumnName = "ID")
    @ManyToOne
    private Estadohabitacion idestado;
    @JoinColumn(name = "IDTIPOHABITACION", referencedColumnName = "ID")
    @ManyToOne
    private Tipohabitacion idtipohabitacion;
    @OneToMany(mappedBy = "idhabitacion")
    private List<Reservas> reservasList;

    public Habitaciones() {
    }

    public Habitaciones(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNumerohabitacion() {
        return numerohabitacion;
    }

    public void setNumerohabitacion(String numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto1() {
        return foto1;
    }

    public void setFoto1(String foto1) {
        this.foto1 = foto1;
    }

    public String getFoto2() {
        return foto2;
    }

    public void setFoto2(String foto2) {
        this.foto2 = foto2;
    }

    public String getFoto3() {
        return foto3;
    }

    public void setFoto3(String foto3) {
        this.foto3 = foto3;
    }

    @XmlTransient
    public List<Calendariohabitaciones> getCalendariohabitacionesList() {
        return calendariohabitacionesList;
    }

    public void setCalendariohabitacionesList(List<Calendariohabitaciones> calendariohabitacionesList) {
        this.calendariohabitacionesList = calendariohabitacionesList;
    }

    public Estadohabitacion getIdestado() {
        return idestado;
    }

    public void setIdestado(Estadohabitacion idestado) {
        this.idestado = idestado;
    }

    public Tipohabitacion getIdtipohabitacion() {
        return idtipohabitacion;
    }

    public void setIdtipohabitacion(Tipohabitacion idtipohabitacion) {
        this.idtipohabitacion = idtipohabitacion;
    }

    @XmlTransient
    public List<Reservas> getReservasList() {
        return reservasList;
    }

    public void setReservasList(List<Reservas> reservasList) {
        this.reservasList = reservasList;
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
        if (!(object instanceof Habitaciones)) {
            return false;
        }
        Habitaciones other = (Habitaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Habitaciones[ id=" + id + " ]";
    }
    
}
