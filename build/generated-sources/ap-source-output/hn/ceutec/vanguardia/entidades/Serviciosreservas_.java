package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Descuentos;
import hn.ceutec.vanguardia.entidades.Promociones;
import hn.ceutec.vanguardia.entidades.Reservas;
import hn.ceutec.vanguardia.entidades.Servicios;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-12T18:33:09")
@StaticMetamodel(Serviciosreservas.class)
public class Serviciosreservas_ { 

    public static volatile SingularAttribute<Serviciosreservas, Date> fecha;
    public static volatile SingularAttribute<Serviciosreservas, Descuentos> iddescuento;
    public static volatile SingularAttribute<Serviciosreservas, BigInteger> precio;
    public static volatile SingularAttribute<Serviciosreservas, Reservas> idreserva;
    public static volatile SingularAttribute<Serviciosreservas, BigDecimal> id;
    public static volatile SingularAttribute<Serviciosreservas, Promociones> idpromocion;
    public static volatile SingularAttribute<Serviciosreservas, Servicios> idservicio;

}