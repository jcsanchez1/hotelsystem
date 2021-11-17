package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Productos;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-12T18:33:09")
@StaticMetamodel(Proveedores.class)
public class Proveedores_ { 

    public static volatile SingularAttribute<Proveedores, String> descripcion;
    public static volatile ListAttribute<Proveedores, Productos> productosList;
    public static volatile SingularAttribute<Proveedores, BigDecimal> id;

}