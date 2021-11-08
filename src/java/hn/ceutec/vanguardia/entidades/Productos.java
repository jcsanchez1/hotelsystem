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
@Table(name = "PRODUCTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")
    , @NamedQuery(name = "Productos.findById", query = "SELECT p FROM Productos p WHERE p.id = :id")
    , @NamedQuery(name = "Productos.findByCodigo", query = "SELECT p FROM Productos p WHERE p.codigo = :codigo")
    , @NamedQuery(name = "Productos.findByDescripcionproducto", query = "SELECT p FROM Productos p WHERE p.descripcionproducto = :descripcionproducto")
    , @NamedQuery(name = "Productos.findByPrecio", query = "SELECT p FROM Productos p WHERE p.precio = :precio")
    , @NamedQuery(name = "Productos.findByStock", query = "SELECT p FROM Productos p WHERE p.stock = :stock")
    , @NamedQuery(name = "Productos.findByIva", query = "SELECT p FROM Productos p WHERE p.iva = :iva")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "CODIGO")
    private BigInteger codigo;
    @Column(name = "DESCRIPCIONPRODUCTO")
    private String descripcionproducto;
    @Basic(optional = false)
    @Column(name = "PRECIO")
    private BigInteger precio;
    @Column(name = "STOCK")
    private BigInteger stock;
    @Column(name = "IVA")
    private BigInteger iva;
    @JoinColumn(name = "ESTADO", referencedColumnName = "ID")
    @ManyToOne
    private Estadosproductos estado;
    @JoinColumn(name = "IDMARCA", referencedColumnName = "ID")
    @ManyToOne
    private Marcas idmarca;
    @JoinColumn(name = "IDPRESENTACION", referencedColumnName = "ID")
    @ManyToOne
    private Presentaciones idpresentacion;
    @JoinColumn(name = "IDPROVEEDOR", referencedColumnName = "ID")
    @ManyToOne
    private Proveedores idproveedor;
    @JoinColumn(name = "IDZONA", referencedColumnName = "ID")
    @ManyToOne
    private Zonas idzona;

    public Productos() {
    }

    public Productos(BigDecimal id) {
        this.id = id;
    }

    public Productos(BigDecimal id, BigInteger precio) {
        this.id = id;
        this.precio = precio;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getCodigo() {
        return codigo;
    }

    public void setCodigo(BigInteger codigo) {
        this.codigo = codigo;
    }

    public String getDescripcionproducto() {
        return descripcionproducto;
    }

    public void setDescripcionproducto(String descripcionproducto) {
        this.descripcionproducto = descripcionproducto;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public BigInteger getStock() {
        return stock;
    }

    public void setStock(BigInteger stock) {
        this.stock = stock;
    }

    public BigInteger getIva() {
        return iva;
    }

    public void setIva(BigInteger iva) {
        this.iva = iva;
    }

    public Estadosproductos getEstado() {
        return estado;
    }

    public void setEstado(Estadosproductos estado) {
        this.estado = estado;
    }

    public Marcas getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(Marcas idmarca) {
        this.idmarca = idmarca;
    }

    public Presentaciones getIdpresentacion() {
        return idpresentacion;
    }

    public void setIdpresentacion(Presentaciones idpresentacion) {
        this.idpresentacion = idpresentacion;
    }

    public Proveedores getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Proveedores idproveedor) {
        this.idproveedor = idproveedor;
    }

    public Zonas getIdzona() {
        return idzona;
    }

    public void setIdzona(Zonas idzona) {
        this.idzona = idzona;
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
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.Productos[ id=" + id + " ]";
    }
    
}
