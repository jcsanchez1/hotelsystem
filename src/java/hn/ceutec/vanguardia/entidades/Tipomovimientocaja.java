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
@Table(name = "TIPOMOVIMIENTOCAJA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipomovimientocaja.findAll", query = "SELECT t FROM Tipomovimientocaja t")
    , @NamedQuery(name = "Tipomovimientocaja.findById", query = "SELECT t FROM Tipomovimientocaja t WHERE t.id = :id")
    , @NamedQuery(name = "Tipomovimientocaja.findByDescripcion", query = "SELECT t FROM Tipomovimientocaja t WHERE t.descripcion = :descripcion")})
public class Tipomovimientocaja implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(mappedBy = "idtipomovimiento")
    private List<Movimientocaja> movimientocajaList;

    public Tipomovimientocaja() {
    }

    public Tipomovimientocaja(BigDecimal id) {
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

    @XmlTransient
    public List<Movimientocaja> getMovimientocajaList() {
        return movimientocajaList;
    }

    public void setMovimientocajaList(List<Movimientocaja> movimientocajaList) {
        this.movimientocajaList = movimientocajaList;
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
        if (!(object instanceof Tipomovimientocaja)) {
            return false;
        }
        Tipomovimientocaja other = (Tipomovimientocaja) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Tipomovimientocaja[ id=" + id + " ]";
    }
    
}
