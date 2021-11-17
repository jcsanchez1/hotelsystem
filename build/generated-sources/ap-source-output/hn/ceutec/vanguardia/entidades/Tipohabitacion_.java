package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Descuentos;
import hn.ceutec.vanguardia.entidades.Habitaciones;
import hn.ceutec.vanguardia.entidades.Promociones;
import hn.ceutec.vanguardia.entidades.Servicios;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-12T18:33:09")
@StaticMetamodel(Tipohabitacion.class)
public class Tipohabitacion_ { 

    public static volatile SingularAttribute<Tipohabitacion, Servicios> servicios;
    public static volatile ListAttribute<Tipohabitacion, Descuentos> descuentosList;
    public static volatile SingularAttribute<Tipohabitacion, BigInteger> precio;
    public static volatile ListAttribute<Tipohabitacion, Habitaciones> habitacionesList;
    public static volatile ListAttribute<Tipohabitacion, Promociones> promocionesList;
    public static volatile SingularAttribute<Tipohabitacion, String> tipohabitacion;
    public static volatile SingularAttribute<Tipohabitacion, String> condiciones;
    public static volatile SingularAttribute<Tipohabitacion, BigDecimal> id;

}