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
@Table(name = "ESTADOHABITACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadohabitacion.findAll", query = "SELECT e FROM Estadohabitacion e")
    , @NamedQuery(name = "Estadohabitacion.findById", query = "SELECT e FROM Estadohabitacion e WHERE e.id = :id")
    , @NamedQuery(name = "Estadohabitacion.findByEstadohabitacion", query = "SELECT e FROM Estadohabitacion e WHERE e.estadohabitacion = :estadohabitacion")})
public class Estadohabitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "ESTADOHABITACION")
    private String estadohabitacion;
    @OneToMany(mappedBy = "idestado")
    private List<Habitaciones> habitacionesList;

    public Estadohabitacion() {
    }

    public Estadohabitacion(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getEstadohabitacion() {
        return estadohabitacion;
    }

    public void setEstadohabitacion(String estadohabitacion) {
        this.estadohabitacion = estadohabitacion;
    }

    @XmlTransient
    public List<Habitaciones> getHabitacionesList() {
        return habitacionesList;
    }

    public void setHabitacionesList(List<Habitaciones> habitacionesList) {
        this.habitacionesList = habitacionesList;
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
        if (!(object instanceof Estadohabitacion)) {
            return false;
        }
        Estadohabitacion other = (Estadohabitacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Estadohabitacion[ id=" + id + " ]";
    }
    
}
