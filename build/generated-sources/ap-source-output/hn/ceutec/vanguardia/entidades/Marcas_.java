package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Productos;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T13:19:43")
@StaticMetamodel(Marcas.class)
public class Marcas_ { 

    public static volatile SingularAttribute<Marcas, String> descripcion;
    public static volatile ListAttribute<Marcas, Productos> productosList;
    public static volatile SingularAttribute<Marcas, BigDecimal> id;

}