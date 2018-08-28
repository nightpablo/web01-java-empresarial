package utn.frsf.ofa.cursojava.rrhh.web.modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-08-27T21:58:52.460-0300")
@StaticMetamodel(Empleado.class)
public class Empleado_ {
	public static volatile SingularAttribute<Empleado, Integer> id;
	public static volatile SingularAttribute<Empleado, String> nombre;
	public static volatile SingularAttribute<Empleado, String> correoElectronico;
	public static volatile SingularAttribute<Empleado, String> cuil;
	public static volatile SingularAttribute<Empleado, Date> fechaIngreso;
	public static volatile SingularAttribute<Empleado, Integer> horasTrabajadas;
	public static volatile ListAttribute<Empleado, Proyecto> proyectosAsignados;
}
