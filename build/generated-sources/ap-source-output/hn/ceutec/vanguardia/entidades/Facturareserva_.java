package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.InfoHotel;
import hn.ceutec.vanguardia.entidades.Movimientostc;
import hn.ceutec.vanguardia.entidades.Reservas;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-12T18:33:09")
@StaticMetamodel(Facturareserva.class)
public class Facturareserva_ { 

    public static volatile SingularAttribute<Facturareserva, Date> fecha;
    public static volatile SingularAttribute<Facturareserva, String> numerofactura;
    public static volatile SingularAttribute<Facturareserva, BigInteger> total;
    public static volatile SingularAttribute<Facturareserva, BigInteger> impuesto;
    public static volatile SingularAttribute<Facturareserva, InfoHotel> infoHotel;
    public static volatile SingularAttribute<Facturareserva, BigInteger> subtotal;
    public static volatile SingularAttribute<Facturareserva, Reservas> idreserva;
    public static volatile SingularAttribute<Facturareserva, BigInteger> idinfohotel;
    public static volatile SingularAttribute<Facturareserva, BigInteger> pagotarjeta;
    public static volatile SingularAttribute<Facturareserva, BigInteger> pagoefectivo;
    public static volatile SingularAttribute<Facturareserva, BigDecimal> id;
    public static volatile ListAttribute<Facturareserva, Movimientostc> movimientostcList;

}