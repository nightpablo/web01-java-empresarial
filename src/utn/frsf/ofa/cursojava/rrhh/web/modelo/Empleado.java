package utn.frsf.ofa.cursojava.rrhh.web.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.TableGenerator;


import java.util.Collection;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TIPO_EMPLEADO", discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue("1")
@TableGenerator(name = "empleados")
public class Empleado {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID_EMPLEADO")
	private int id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "CORREO_ELECTRONICO")
	private String correoElectronico;
	@Column(name = "CUIL")
	private String cuil;
	@Column(name = "FECHA_INGRESO")
	private Date fechaIngreso;
	@Column(name = "HORAS_TRABAJADAS")
	private int horasTrabajadas;
	
	
	@ManyToMany(mappedBy = "empleados")
	private List<Proyecto> proyectosAsignados;
	
	
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
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public List<Proyecto> getProyectosAsignados() {
	    return proyectosAsignados;
	}
	public void setProyectosAsignados(List<Proyecto> param) {
	    this.proyectosAsignados = param;
	}
}
