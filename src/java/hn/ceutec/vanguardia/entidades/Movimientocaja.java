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
@Table(name = "MOVIMIENTOCAJA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimientocaja.findAll", query = "SELECT m FROM Movimientocaja m")
    , @NamedQuery(name = "Movimientocaja.findByIdmovimientocaja", query = "SELECT m FROM Movimientocaja m WHERE m.idmovimientocaja = :idmovimientocaja")
    , @NamedQuery(name = "Movimientocaja.findByFecha", query = "SELECT m FROM Movimientocaja m WHERE m.fecha = :fecha")
    , @NamedQuery(name = "Movimientocaja.findByConcepto", query = "SELECT m FROM Movimientocaja m WHERE m.concepto = :concepto")
    , @NamedQuery(name = "Movimientocaja.findByMontoinicial", query = "SELECT m FROM Movimientocaja m WHERE m.montoinicial = :montoinicial")})
public class Movimientocaja implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDMOVIMIENTOCAJA")
    private BigDecimal idmovimientocaja;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "CONCEPTO")
    private String concepto;
    @Column(name = "MONTOINICIAL")
    private BigDecimal montoinicial;
    @JoinColumn(name = "IDTIPOMOVIMIENTO", referencedColumnName = "ID")
    @ManyToOne
    private Tipomovimientocaja idtipomovimiento;
    @OneToMany(mappedBy = "idmovimieto")
    private List<Movimientocajadetalle> movimientocajadetalleList;

    public Movimientocaja() {
    }

    public Movimientocaja(BigDecimal idmovimientocaja) {
        this.idmovimientocaja = idmovimientocaja;
    }

    public BigDecimal getIdmovimientocaja() {
        return idmovimientocaja;
    }

    public void setIdmovimientocaja(BigDecimal idmovimientocaja) {
        this.idmovimientocaja = idmovimientocaja;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public BigDecimal getMontoinicial() {
        return montoinicial;
    }

    public void setMontoinicial(BigDecimal montoinicial) {
        this.montoinicial = montoinicial;
    }

    public Tipomovimientocaja getIdtipomovimiento() {
        return idtipomovimiento;
    }

    public void setIdtipomovimiento(Tipomovimientocaja idtipomovimiento) {
        this.idtipomovimiento = idtipomovimiento;
    }

    @XmlTransient
    public List<Movimientocajadetalle> getMovimientocajadetalleList() {
        return movimientocajadetalleList;
    }

    public void setMovimientocajadetalleList(List<Movimientocajadetalle> movimientocajadetalleList) {
        this.movimientocajadetalleList = movimientocajadetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmovimientocaja != null ? idmovimientocaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimientocaja)) {
            return false;
        }
        Movimientocaja other = (Movimientocaja) object;
        if ((this.idmovimientocaja == null && other.idmovimientocaja != null) || (this.idmovimientocaja != null && !this.idmovimientocaja.equals(other.idmovimientocaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Movimientocaja[ idmovimientocaja=" + idmovimientocaja + " ]";
    }
    
}
