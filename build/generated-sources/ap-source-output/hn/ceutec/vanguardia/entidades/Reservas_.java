package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Estadoreserva;
import hn.ceutec.vanguardia.entidades.Facturareserva;
import hn.ceutec.vanguardia.entidades.Habitaciones;
import hn.ceutec.vanguardia.entidades.Personas;
import hn.ceutec.vanguardia.entidades.Serviciosreservas;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T13:19:43")
@StaticMetamodel(Reservas.class)
public class Reservas_ { 

    public static volatile SingularAttribute<Reservas, Estadoreserva> idestadoreserva;
    public static volatile SingularAttribute<Reservas, Habitaciones> idhabitacion;
    public static volatile SingularAttribute<Reservas, Date> checkin;
    public static volatile ListAttribute<Reservas, Facturareserva> facturareservaList;
    public static volatile SingularAttribute<Reservas, Date> fechareserva;
    public static volatile SingularAttribute<Reservas, Personas> idpersona;
    public static volatile SingularAttribute<Reservas, Date> fechasalida;
    public static volatile ListAttribute<Reservas, Serviciosreservas> serviciosreservasList;
    public static volatile SingularAttribute<Reservas, BigDecimal> id;
    public static volatile SingularAttribute<Reservas, Date> checkout;

}