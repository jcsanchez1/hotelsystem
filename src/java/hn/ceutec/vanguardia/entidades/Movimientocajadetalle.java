/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.ceutec.vanguardia.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juanc
 */
@Entity
@Table(name = "MOVIMIENTOCAJADETALLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimientocajadetalle.findAll", query = "SELECT m FROM Movimientocajadetalle m")
    , @NamedQuery(name = "Movimientocajadetalle.findById", query = "SELECT m FROM Movimientocajadetalle m WHERE m.id = :id")
    , @NamedQuery(name = "Movimientocajadetalle.findByM5c", query = "SELECT m FROM Movimientocajadetalle m WHERE m.m5c = :m5c")
    , @NamedQuery(name = "Movimientocajadetalle.findByM10c", query = "SELECT m FROM Movimientocajadetalle m WHERE m.m10c = :m10c")
    , @NamedQuery(name = "Movimientocajadetalle.findByM20c", query = "SELECT m FROM Movimientocajadetalle m WHERE m.m20c = :m20c")
    , @NamedQuery(name = "Movimientocajadetalle.findByM50c", query = "SELECT m FROM Movimientocajadetalle m WHERE m.m50c = :m50c")
    , @NamedQuery(name = "Movimientocajadetalle.findByB1l", query = "SELECT m FROM Movimientocajadetalle m WHERE m.b1l = :b1l")
    , @NamedQuery(name = "Movimientocajadetalle.findByB2l", query = "SELECT m FROM Movimientocajadetalle m WHERE m.b2l = :b2l")
    , @NamedQuery(name = "Movimientocajadetalle.findByB5l", query = "SELECT m FROM Movimientocajadetalle m WHERE m.b5l = :b5l")
    , @NamedQuery(name = "Movimientocajadetalle.findByB10l", query = "SELECT m FROM Movimientocajadetalle m WHERE m.b10l = :b10l")
    , @NamedQuery(name = "Movimientocajadetalle.findByB20l", query = "SELECT m FROM Movimientocajadetalle m WHERE m.b20l = :b20l")
    , @NamedQuery(name = "Movimientocajadetalle.findByB50l", query = "SELECT m FROM Movimientocajadetalle m WHERE m.b50l = :b50l")
    , @NamedQuery(name = "Movimientocajadetalle.findByB100l", query = "SELECT m FROM Movimientocajadetalle m WHERE m.b100l = :b100l")
    , @NamedQuery(name = "Movimientocajadetalle.findByB200l", query = "SELECT m FROM Movimientocajadetalle m WHERE m.b200l = :b200l")
    , @NamedQuery(name = "Movimientocajadetalle.findByB500l", query = "SELECT m FROM Movimientocajadetalle m WHERE m.b500l = :b500l")})
public class Movimientocajadetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "M5C")
    private BigInteger m5c;
    @Column(name = "M10C")
    private BigInteger m10c;
    @Column(name = "M20C")
    private BigInteger m20c;
    @Column(name = "M50C")
    private BigInteger m50c;
    @Column(name = "B1L")
    private BigInteger b1l;
    @Column(name = "B2L")
    private BigInteger b2l;
    @Column(name = "B5L")
    private BigInteger b5l;
    @Column(name = "B10L")
    private BigInteger b10l;
    @Column(name = "B20L")
    private BigInteger b20l;
    @Column(name = "B50L")
    private BigInteger b50l;
    @Column(name = "B100L")
    private BigInteger b100l;
    @Column(name = "B200L")
    private BigInteger b200l;
    @Column(name = "B500L")
    private BigInteger b500l;
    @JoinColumn(name = "IDMOVIMIETO", referencedColumnName = "IDMOVIMIENTOCAJA")
    @ManyToOne
    private Movimientocaja idmovimieto;

    public Movimientocajadetalle() {
    }

    public Movimientocajadetalle(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getM5c() {
        return m5c;
    }

    public void setM5c(BigInteger m5c) {
        this.m5c = m5c;
    }

    public BigInteger getM10c() {
        return m10c;
    }

    public void setM10c(BigInteger m10c) {
        this.m10c = m10c;
    }

    public BigInteger getM20c() {
        return m20c;
    }

    public void setM20c(BigInteger m20c) {
        this.m20c = m20c;
    }

    public BigInteger getM50c() {
        return m50c;
    }

    public void setM50c(BigInteger m50c) {
        this.m50c = m50c;
    }

    public BigInteger getB1l() {
        return b1l;
    }

    public void setB1l(BigInteger b1l) {
        this.b1l = b1l;
    }

    public BigInteger getB2l() {
        return b2l;
    }

    public void setB2l(BigInteger b2l) {
        this.b2l = b2l;
    }

    public BigInteger getB5l() {
        return b5l;
    }

    public void setB5l(BigInteger b5l) {
        this.b5l = b5l;
    }

    public BigInteger getB10l() {
        return b10l;
    }

    public void setB10l(BigInteger b10l) {
        this.b10l = b10l;
    }

    public BigInteger getB20l() {
        return b20l;
    }

    public void setB20l(BigInteger b20l) {
        this.b20l = b20l;
    }

    public BigInteger getB50l() {
        return b50l;
    }

    public void setB50l(BigInteger b50l) {
        this.b50l = b50l;
    }

    public BigInteger getB100l() {
        return b100l;
    }

    public void setB100l(BigInteger b100l) {
        this.b100l = b100l;
    }

    public BigInteger getB200l() {
        return b200l;
    }

    public void setB200l(BigInteger b200l) {
        this.b200l = b200l;
    }

    public BigInteger getB500l() {
        return b500l;
    }

    public void setB500l(BigInteger b500l) {
        this.b500l = b500l;
    }

    public Movimientocaja getIdmovimieto() {
        return idmovimieto;
    }

    public void setIdmovimieto(Movimientocaja idmovimieto) {
        this.idmovimieto = idmovimieto;
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
        if (!(object instanceof Movimientocajadetalle)) {
            return false;
        }
        Movimientocajadetalle other = (Movimientocajadetalle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Movimientocajadetalle[ id=" + id + " ]";
    }
    
}
