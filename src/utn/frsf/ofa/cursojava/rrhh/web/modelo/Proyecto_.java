package utn.frsf.ofa.cursojava.rrhh.web.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-08-27T21:58:52.460-0300")
@StaticMetamodel(Proyecto.class)
public class Proyecto_ {
	public static volatile SingularAttribute<Proyecto, Integer> id;
	public static volatile SingularAttribute<Proyecto, String> nombre;
	public static volatile SingularAttribute<Proyecto, String> descripcion;
	public static volatile SingularAttribute<Proyecto, Double> presupuestoMax;
	public static volatile ListAttribute<Proyecto, Empleado> empleados;
	public static volatile SingularAttribute<Proyecto, Cliente> cliente;
}
