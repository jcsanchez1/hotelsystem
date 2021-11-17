package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Facturareserva;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-12T18:33:09")
@StaticMetamodel(Movimientostc.class)
public class Movimientostc_ { 

    public static volatile SingularAttribute<Movimientostc, BigInteger> confirmacion;
    public static volatile SingularAttribute<Movimientostc, Date> fecha;
    public static volatile SingularAttribute<Movimientostc, BigInteger> estado;
    public static volatile SingularAttribute<Movimientostc, BigInteger> monto;
    public static volatile SingularAttribute<Movimientostc, String> numerotc;
    public static volatile SingularAttribute<Movimientostc, BigDecimal> id;
    public static volatile SingularAttribute<Movimientostc, Facturareserva> idfactura;

}