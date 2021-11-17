package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Serviciosreservas;
import hn.ceutec.vanguardia.entidades.Tipohabitacion;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-12T18:33:09")
@StaticMetamodel(Servicios.class)
public class Servicios_ { 

    public static volatile SingularAttribute<Servicios, BigInteger> precio;
    public static volatile SingularAttribute<Servicios, String> servicio;
    public static volatile SingularAttribute<Servicios, BigInteger> idtipohabitacion;
    public static volatile ListAttribute<Servicios, Serviciosreservas> serviciosreservasList;
    public static volatile SingularAttribute<Servicios, Tipohabitacion> tipohabitacion;
    public static volatile SingularAttribute<Servicios, BigDecimal> id;

}