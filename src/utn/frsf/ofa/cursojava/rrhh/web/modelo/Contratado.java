package utn.frsf.ofa.cursojava.rrhh.web.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("3")
public class Contratado extends Empleado {
	@Column(name = "COSTO_HORA")
	private double costoHora;

	public double getCostoHora() {
		return costoHora;
	}

	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}
	
	
}
