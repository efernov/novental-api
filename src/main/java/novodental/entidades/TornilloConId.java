package novodental.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import novodental.ortodoncia.Tornillo;



@Entity
@Access(value = AccessType.FIELD)
@DiscriminatorValue("Tornillo")
public class TornilloConId extends MaterialConId implements Tornillo {
	
	@Column( name = "DIRECCION_APERTURA")
	private String direccionApertura;
	@Column( name = "APERTURA")
	private int aperturaMilimetros;
	
	
	public TornilloConId() {
		super();
	}

	

	public TornilloConId(int id, float precio, String direccionApertura, int aperturaMilimetros) {
		super(id, precio);
		this.direccionApertura = direccionApertura;
		this.aperturaMilimetros = aperturaMilimetros;
	}



	public String getDireccionApertura() {
		return direccionApertura;
	}

	public void setDireccionApertura(String direccionApertura) {
		this.direccionApertura = direccionApertura;
	}

	public int getAperturaMilimetros() {
		return aperturaMilimetros;
	}

	public void setAperturaMilimetros(int aperturaMilimetros) {
		this.aperturaMilimetros = aperturaMilimetros;
	}

	@Override
	public String toString() {
		return "TornilloConId [direccionApertura=" + direccionApertura + ", aperturaMilimetros=" + aperturaMilimetros
				+ "]";
	}
	
	
	

		
}
