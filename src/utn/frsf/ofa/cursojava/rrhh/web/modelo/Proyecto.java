package utn.frsf.ofa.cursojava.rrhh.web.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.TableGenerator;

import java.util.Collection;
import javax.persistence.ManyToOne;

@Entity
@TableGenerator(name = "proyectos")
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID_PROYECTO")
	private int id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "PRESUPUESTO_MAXIMO")
	private Double presupuestoMax;
	
	@ManyToMany
	@JoinTable(name = "PROYECTO_EMPLEADO",
	joinColumns = @JoinColumn(name = "ID_PROYECTO"),
	inverseJoinColumns = @JoinColumn(name = "ID_EMPLEADO")
	)
	private List<Empleado> empleados;
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENTE")
	private Cliente cliente;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPresupuestoMax() {
		return presupuestoMax;
	}
	public void setPresupuestoMax(Double presupuestoMax) {
		this.presupuestoMax = presupuestoMax;
	}
	public List<Empleado> getEmpleados() {
	    return empleados;
	}
	public void setEmpleados(List<Empleado> param) {
	    this.empleados = param;
	}
	public Cliente getCliente() {
	    return cliente;
	}
	public void setCliente(Cliente param) {
	    this.cliente = param;
	}
	
	
}
