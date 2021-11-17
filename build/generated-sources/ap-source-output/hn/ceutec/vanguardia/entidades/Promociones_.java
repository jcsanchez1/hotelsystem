package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Serviciosreservas;
import hn.ceutec.vanguardia.entidades.Tipohabitacion;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-12T18:33:09")
@StaticMetamodel(Promociones.class)
public class Promociones_ { 

    public static volatile SingularAttribute<Promociones, String> promocion;
    public static volatile SingularAttribute<Promociones, Tipohabitacion> idtipohabitacion;
    public static volatile ListAttribute<Promociones, Serviciosreservas> serviciosreservasList;
    public static volatile SingularAttribute<Promociones, BigDecimal> id;

}