package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Movimientocaja;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T13:19:43")
@StaticMetamodel(Tipomovimientocaja.class)
public class Tipomovimientocaja_ { 

    public static volatile SingularAttribute<Tipomovimientocaja, String> descripcion;
    public static volatile SingularAttribute<Tipomovimientocaja, BigDecimal> id;
    public static volatile ListAttribute<Tipomovimientocaja, Movimientocaja> movimientocajaList;

}