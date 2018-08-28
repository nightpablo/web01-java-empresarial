package utn.frsf.ofa.cursojava.rrhh.web.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@DiscriminatorValue("2")
public class Efectivo extends Empleado {
	@Column(name = "SUELDO_BASICO")
	private double sueldoBasico;
	@Column(name = "COMISIONES")
	private double comisiones;
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	public double getComisiones() {
		return comisiones;
	}
	public void setComisiones(double comisiones) {
		this.comisiones = comisiones;
	}
	
	
}
