package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Habitaciones;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T13:19:43")
@StaticMetamodel(Calendariohabitaciones.class)
public class Calendariohabitaciones_ { 

    public static volatile SingularAttribute<Calendariohabitaciones, Date> fecha;
    public static volatile SingularAttribute<Calendariohabitaciones, BigInteger> estado;
    public static volatile SingularAttribute<Calendariohabitaciones, Habitaciones> idhabitacion;
    public static volatile SingularAttribute<Calendariohabitaciones, BigDecimal> id;

}