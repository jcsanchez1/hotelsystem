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
@StaticMetamodel(Descuentos.class)
public class Descuentos_ { 

    public static volatile SingularAttribute<Descuentos, String> descripcion;
    public static volatile SingularAttribute<Descuentos, Tipohabitacion> idtipohabitacion;
    public static volatile ListAttribute<Descuentos, Serviciosreservas> serviciosreservasList;
    public static volatile SingularAttribute<Descuentos, BigDecimal> id;
    public static volatile SingularAttribute<Descuentos, BigInteger> porcentaje;

}