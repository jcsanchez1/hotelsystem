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
@Table(name = "PROMOCIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Promociones.findAll", query = "SELECT p FROM Promociones p")
    , @NamedQuery(name = "Promociones.findById", query = "SELECT p FROM Promociones p WHERE p.id = :id")
    , @NamedQuery(name = "Promociones.findByPromocion", query = "SELECT p FROM Promociones p WHERE p.promocion = :promocion")})
public class Promociones implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "PROMOCION")
    private String promocion;
    @JoinColumn(name = "IDTIPOHABITACION", referencedColumnName = "ID")
    @ManyToOne
    private Tipohabitacion idtipohabitacion;
    @OneToMany(mappedBy = "idpromocion")
    private List<Serviciosreservas> serviciosreservasList;

    public Promociones() {
    }

    public Promociones(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    public Tipohabitacion getIdtipohabitacion() {
        return idtipohabitacion;
    }

    public void setIdtipohabitacion(Tipohabitacion idtipohabitacion) {
        this.idtipohabitacion = idtipohabitacion;
    }

    @XmlTransient
    public List<Serviciosreservas> getServiciosreservasList() {
        return serviciosreservasList;
    }

    public void setServiciosreservasList(List<Serviciosreservas> serviciosreservasList) {
        this.serviciosreservasList = serviciosreservasList;
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
        if (!(object instanceof Promociones)) {
            return false;
        }
        Promociones other = (Promociones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Promociones[ id=" + id + " ]";
    }
    
}
