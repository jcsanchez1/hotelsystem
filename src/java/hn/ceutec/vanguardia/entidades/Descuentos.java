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
@Table(name = "DESCUENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Descuentos.findAll", query = "SELECT d FROM Descuentos d")
    , @NamedQuery(name = "Descuentos.findById", query = "SELECT d FROM Descuentos d WHERE d.id = :id")
    , @NamedQuery(name = "Descuentos.findByDescripcion", query = "SELECT d FROM Descuentos d WHERE d.descripcion = :descripcion")
    , @NamedQuery(name = "Descuentos.findByPorcentaje", query = "SELECT d FROM Descuentos d WHERE d.porcentaje = :porcentaje")})
public class Descuentos implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "PORCENTAJE")
    private BigInteger porcentaje;
    @OneToMany(mappedBy = "iddescuento")
    private List<Serviciosreservas> serviciosreservasList;
    @JoinColumn(name = "IDTIPOHABITACION", referencedColumnName = "ID")
    @ManyToOne
    private Tipohabitacion idtipohabitacion;

    public Descuentos() {
    }

    public Descuentos(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigInteger getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigInteger porcentaje) {
        this.porcentaje = porcentaje;
    }

    @XmlTransient
    public List<Serviciosreservas> getServiciosreservasList() {
        return serviciosreservasList;
    }

    public void setServiciosreservasList(List<Serviciosreservas> serviciosreservasList) {
        this.serviciosreservasList = serviciosreservasList;
    }

    public Tipohabitacion getIdtipohabitacion() {
        return idtipohabitacion;
    }

    public void setIdtipohabitacion(Tipohabitacion idtipohabitacion) {
        this.idtipohabitacion = idtipohabitacion;
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
        if (!(object instanceof Descuentos)) {
            return false;
        }
        Descuentos other = (Descuentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Descuentos[ id=" + id + " ]";
    }
    
}
