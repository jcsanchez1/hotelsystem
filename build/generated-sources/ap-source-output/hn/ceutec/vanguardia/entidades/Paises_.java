package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Personas;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T13:19:43")
@StaticMetamodel(Paises.class)
public class Paises_ { 

    public static volatile SingularAttribute<Paises, String> codigoarea;
    public static volatile ListAttribute<Paises, Personas> personasList;
    public static volatile SingularAttribute<Paises, BigDecimal> id;
    public static volatile SingularAttribute<Paises, String> nombre;
    public static volatile SingularAttribute<Paises, String> iso3;

}