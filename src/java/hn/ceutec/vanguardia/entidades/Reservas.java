/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.ceutec.vanguardia.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author juanc
 */
@Entity
@Table(name = "RESERVAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservas.findAll", query = "SELECT r FROM Reservas r")
    , @NamedQuery(name = "Reservas.findById", query = "SELECT r FROM Reservas r WHERE r.id = :id")
    , @NamedQuery(name = "Reservas.findByFechareserva", query = "SELECT r FROM Reservas r WHERE r.fechareserva = :fechareserva")
    , @NamedQuery(name = "Reservas.findByCheckin", query = "SELECT r FROM Reservas r WHERE r.checkin = :checkin")
    , @NamedQuery(name = "Reservas.findByCheckout", query = "SELECT r FROM Reservas r WHERE r.checkout = :checkout")
    , @NamedQuery(name = "Reservas.findByFechasalida", query = "SELECT r FROM Reservas r WHERE r.fechasalida = :fechasalida")})
public class Reservas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "FECHARESERVA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechareserva;
    @Column(name = "CHECKIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkin;
    @Column(name = "CHECKOUT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date checkout;
    @Column(name = "FECHASALIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechasalida;
    @OneToMany(mappedBy = "idreserva")
    private List<Facturareserva> facturareservaList;
    @OneToMany(mappedBy = "idreserva")
    private List<Serviciosreservas> serviciosreservasList;
    @JoinColumn(name = "IDESTADORESERVA", referencedColumnName = "ID")
    @ManyToOne
    private Estadoreserva idestadoreserva;
    @JoinColumn(name = "IDHABITACION", referencedColumnName = "ID")
    @ManyToOne
    private Habitaciones idhabitacion;
    @JoinColumn(name = "IDPERSONA", referencedColumnName = "ID")
    @ManyToOne
    private Personas idpersona;

    public Reservas() {
    }

    public Reservas(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Date getFechareserva() {
        return fechareserva;
    }

    public void setFechareserva(Date fechareserva) {
        this.fechareserva = fechareserva;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    @XmlTransient
    public List<Facturareserva> getFacturareservaList() {
        return facturareservaList;
    }

    public void setFacturareservaList(List<Facturareserva> facturareservaList) {
        this.facturareservaList = facturareservaList;
    }

    @XmlTransient
    public List<Serviciosreservas> getServiciosreservasList() {
        return serviciosreservasList;
    }

    public void setServiciosreservasList(List<Serviciosreservas> serviciosreservasList) {
        this.serviciosreservasList = serviciosreservasList;
    }

    public Estadoreserva getIdestadoreserva() {
        return idestadoreserva;
    }

    public void setIdestadoreserva(Estadoreserva idestadoreserva) {
        this.idestadoreserva = idestadoreserva;
    }

    public Habitaciones getIdhabitacion() {
        return idhabitacion;
    }

    public void setIdhabitacion(Habitaciones idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    public Personas getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Personas idpersona) {
        this.idpersona = idpersona;
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
        if (!(object instanceof Reservas)) {
            return false;
        }
        Reservas other = (Reservas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Reservas[ id=" + id + " ]";
    }
    
}
