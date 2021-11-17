package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Reservas;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-12T18:33:09")
@StaticMetamodel(Estadoreserva.class)
public class Estadoreserva_ { 

    public static volatile SingularAttribute<Estadoreserva, String> descripcion;
    public static volatile SingularAttribute<Estadoreserva, BigDecimal> id;
    public static volatile ListAttribute<Estadoreserva, Reservas> reservasList;

}