package hn.ceutec.vanguardia.entidades;

import hn.ceutec.vanguardia.entidades.Paises;
import hn.ceutec.vanguardia.entidades.Reservas;
import hn.ceutec.vanguardia.entidades.Tipodocumento;
import hn.ceutec.vanguardia.entidades.Tipousuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-23T13:19:43")
@StaticMetamodel(Personas.class)
public class Personas_ { 

    public static volatile SingularAttribute<Personas, String> estado;
    public static volatile SingularAttribute<Personas, Tipodocumento> idtipodocumento;
    public static volatile SingularAttribute<Personas, String> identificacion;
    public static volatile SingularAttribute<Personas, String> nombre;
    public static volatile ListAttribute<Personas, Reservas> reservasList;
    public static volatile SingularAttribute<Personas, String> password;
    public static volatile SingularAttribute<Personas, Date> fechanacimiento;
    public static volatile SingularAttribute<Personas, Date> fechacreacion;
    public static volatile SingularAttribute<Personas, Paises> idpais;
    public static volatile SingularAttribute<Personas, Tipousuario> idtipousuario;
    public static volatile SingularAttribute<Personas, String> apellido;
    public static volatile SingularAttribute<Personas, BigDecimal> id;
    public static volatile SingularAttribute<Personas, String> telefono;
    public static volatile SingularAttribute<Personas, String> email;

}