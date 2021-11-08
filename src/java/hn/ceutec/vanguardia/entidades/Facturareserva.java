/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.ceutec.vanguardia.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.persistence.OneToOne;
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
@Table(name = "FACTURARESERVA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturareserva.findAll", query = "SELECT f FROM Facturareserva f")
    , @NamedQuery(name = "Facturareserva.findById", query = "SELECT f FROM Facturareserva f WHERE f.id = :id")
    , @NamedQuery(name = "Facturareserva.findByNumerofactura", query = "SELECT f FROM Facturareserva f WHERE f.numerofactura = :numerofactura")
    , @NamedQuery(name = "Facturareserva.findByIdinfohotel", query = "SELECT f FROM Facturareserva f WHERE f.idinfohotel = :idinfohotel")
    , @NamedQuery(name = "Facturareserva.findByImpuesto", query = "SELECT f FROM Facturareserva f WHERE f.impuesto = :impuesto")
    , @NamedQuery(name = "Facturareserva.findBySubtotal", query = "SELECT f FROM Facturareserva f WHERE f.subtotal = :subtotal")
    , @NamedQuery(name = "Facturareserva.findByTotal", query = "SELECT f FROM Facturareserva f WHERE f.total = :total")
    , @NamedQuery(name = "Facturareserva.findByPagoefectivo", query = "SELECT f FROM Facturareserva f WHERE f.pagoefectivo = :pagoefectivo")
    , @NamedQuery(name = "Facturareserva.findByPagotarjeta", query = "SELECT f FROM Facturareserva f WHERE f.pagotarjeta = :pagotarjeta")
    , @NamedQuery(name = "Facturareserva.findByFecha", query = "SELECT f FROM Facturareserva f WHERE f.fecha = :fecha")})
public class Facturareserva implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "NUMEROFACTURA")
    private String numerofactura;
    @Column(name = "IDINFOHOTEL")
    private BigInteger idinfohotel;
    @Column(name = "IMPUESTO")
    private BigInteger impuesto;
    @Column(name = "SUBTOTAL")
    private BigInteger subtotal;
    @Column(name = "TOTAL")
    private BigInteger total;
    @Column(name = "PAGOEFECTIVO")
    private BigInteger pagoefectivo;
    @Column(name = "PAGOTARJETA")
    private BigInteger pagotarjeta;
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private InfoHotel infoHotel;
    @JoinColumn(name = "IDRESERVA", referencedColumnName = "ID")
    @ManyToOne
    private Reservas idreserva;
    @OneToMany(mappedBy = "idfactura")
    private List<Movimientostc> movimientostcList;

    public Facturareserva() {
    }

    public Facturareserva(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNumerofactura() {
        return numerofactura;
    }

    public void setNumerofactura(String numerofactura) {
        this.numerofactura = numerofactura;
    }

    public BigInteger getIdinfohotel() {
        return idinfohotel;
    }

    public void setIdinfohotel(BigInteger idinfohotel) {
        this.idinfohotel = idinfohotel;
    }

    public BigInteger getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(BigInteger impuesto) {
        this.impuesto = impuesto;
    }

    public BigInteger getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigInteger subtotal) {
        this.subtotal = subtotal;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public BigInteger getPagoefectivo() {
        return pagoefectivo;
    }

    public void setPagoefectivo(BigInteger pagoefectivo) {
        this.pagoefectivo = pagoefectivo;
    }

    public BigInteger getPagotarjeta() {
        return pagotarjeta;
    }

    public void setPagotarjeta(BigInteger pagotarjeta) {
        this.pagotarjeta = pagotarjeta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public InfoHotel getInfoHotel() {
        return infoHotel;
    }

    public void setInfoHotel(InfoHotel infoHotel) {
        this.infoHotel = infoHotel;
    }

    public Reservas getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Reservas idreserva) {
        this.idreserva = idreserva;
    }

    @XmlTransient
    public List<Movimientostc> getMovimientostcList() {
        return movimientostcList;
    }

    public void setMovimientostcList(List<Movimientostc> movimientostcList) {
        this.movimientostcList = movimientostcList;
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
        if (!(object instanceof Facturareserva)) {
            return false;
        }
        Facturareserva other = (Facturareserva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Facturareserva[ id=" + id + " ]";
    }
    
}
