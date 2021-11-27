package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Estadosproductos;
import hn.ceutec.vanguardia.entidades.Marcas;
import hn.ceutec.vanguardia.entidades.Presentaciones;
import hn.ceutec.vanguardia.entidades.Proveedores;
import hn.ceutec.vanguardia.entidades.Zonas;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T13:19:43")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, Marcas> idmarca;
    public static volatile SingularAttribute<Productos, Proveedores> idproveedor;
    public static volatile SingularAttribute<Productos, BigInteger> codigo;
    public static volatile SingularAttribute<Productos, String> descripcionproducto;
    public static volatile SingularAttribute<Productos, BigInteger> precio;
    public static volatile SingularAttribute<Productos, Estadosproductos> estado;
    public static volatile SingularAttribute<Productos, Zonas> idzona;
    public static volatile SingularAttribute<Productos, BigInteger> iva;
    public static volatile SingularAttribute<Productos, BigDecimal> id;
    public static volatile SingularAttribute<Productos, BigInteger> stock;
    public static volatile SingularAttribute<Productos, Presentaciones> idpresentacion;

}