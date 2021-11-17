package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Movimientocajadetalle;
import hn.ceutec.vanguardia.entidades.Tipomovimientocaja;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-12T18:33:09")
@StaticMetamodel(Movimientocaja.class)
public class Movimientocaja_ { 

    public static volatile SingularAttribute<Movimientocaja, Date> fecha;
    public static volatile SingularAttribute<Movimientocaja, BigDecimal> montoinicial;
    public static volatile ListAttribute<Movimientocaja, Movimientocajadetalle> movimientocajadetalleList;
    public static volatile SingularAttribute<Movimientocaja, String> concepto;
    public static volatile SingularAttribute<Movimientocaja, BigDecimal> idmovimientocaja;
    public static volatile SingularAttribute<Movimientocaja, Tipomovimientocaja> idtipomovimiento;

}