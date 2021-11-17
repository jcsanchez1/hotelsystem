package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Calendariohabitaciones;
import hn.ceutec.vanguardia.entidades.Estadohabitacion;
import hn.ceutec.vanguardia.entidades.Reservas;
import hn.ceutec.vanguardia.entidades.Tipohabitacion;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-12T18:33:09")
@StaticMetamodel(Habitaciones.class)
public class Habitaciones_ { 

    public static volatile ListAttribute<Habitaciones, Calendariohabitaciones> calendariohabitacionesList;
    public static volatile SingularAttribute<Habitaciones, Tipohabitacion> idtipohabitacion;
    public static volatile SingularAttribute<Habitaciones, String> numerohabitacion;
    public static volatile SingularAttribute<Habitaciones, BigDecimal> id;
    public static volatile SingularAttribute<Habitaciones, String> foto1;
    public static volatile SingularAttribute<Habitaciones, String> nombre;
    public static volatile SingularAttribute<Habitaciones, String> foto3;
    public static volatile ListAttribute<Habitaciones, Reservas> reservasList;
    public static volatile SingularAttribute<Habitaciones, String> foto2;
    public static volatile SingularAttribute<Habitaciones, Estadohabitacion> idestado;

}