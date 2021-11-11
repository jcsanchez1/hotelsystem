/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.ceutec.vanguardia.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juanc
 */
@Entity
@Table(name = "INFO_HOTEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InfoHotel.findAll", query = "SELECT i FROM InfoHotel i")
    , @NamedQuery(name = "InfoHotel.findById", query = "SELECT i FROM InfoHotel i WHERE i.id = :id")
    , @NamedQuery(name = "InfoHotel.findByNombre", query = "SELECT i FROM InfoHotel i WHERE i.nombre = :nombre")
    , @NamedQuery(name = "InfoHotel.findByMision", query = "SELECT i FROM InfoHotel i WHERE i.mision = :mision")
    , @NamedQuery(name = "InfoHotel.findByVision", query = "SELECT i FROM InfoHotel i WHERE i.vision = :vision")
    , @NamedQuery(name = "InfoHotel.findByFechacreacion", query = "SELECT i FROM InfoHotel i WHERE i.fechacreacion = :fechacreacion")
    , @NamedQuery(name = "InfoHotel.findByLatitud", query = "SELECT i FROM InfoHotel i WHERE i.latitud = :latitud")
    , @NamedQuery(name = "InfoHotel.findByLonjitud", query = "SELECT i FROM InfoHotel i WHERE i.lonjitud = :lonjitud")
    , @NamedQuery(name = "InfoHotel.findByTelefono", query = "SELECT i FROM InfoHotel i WHERE i.telefono = :telefono")
    , @NamedQuery(name = "InfoHotel.findByEmail", query = "SELECT i FROM InfoHotel i WHERE i.email = :email")
    , @NamedQuery(name = "InfoHotel.findByDireccion", query = "SELECT i FROM InfoHotel i WHERE i.direccion = :direccion")
    , @NamedQuery(name = "InfoHotel.findByRtn", query = "SELECT i FROM InfoHotel i WHERE i.rtn = :rtn")
    , @NamedQuery(name = "InfoHotel.findByA", query = "SELECT i FROM InfoHotel i WHERE i.a = :a")})
public class InfoHotel implements Serializable {

    @Column(name = "CAI")
    private String cai;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LATITUD")
    private BigDecimal latitud;
    @Column(name = "LONJITUD")
    private BigDecimal lonjitud;

    @Lob
    @Column(name = "POLITICAS")
    private String politicas;

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "MISION")
    private String mision;
    @Column(name = "VISION")
    private String vision;
    @Column(name = "FECHACREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacreacion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "RTN")
    private String rtn;
    @Column(name = "")
    private String a;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "infoHotel")
    private Facturareserva facturareserva;

    public InfoHotel() {
    }

    public InfoHotel(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Facturareserva getFacturareserva() {
        return facturareserva;
    }

    public void setFacturareserva(Facturareserva facturareserva) {
        this.facturareserva = facturareserva;
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
        if (!(object instanceof InfoHotel)) {
            return false;
        }
        InfoHotel other = (InfoHotel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hn.ceutec.vanguardia.entidades.InfoHotel[ id=" + id + " ]";
    }

    public String getPoliticas() {
        return politicas;
    }

    public void setPoliticas(String politicas) {
        this.politicas = politicas;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLonjitud() {
        return lonjitud;
    }

    public void setLonjitud(BigDecimal lonjitud) {
        this.lonjitud = lonjitud;
    }

    public String getCai() {
        return cai;
    }

    public void setCai(String cai) {
        this.cai = cai;
    }
    
}
