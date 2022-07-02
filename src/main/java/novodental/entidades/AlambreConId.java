package novodental.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import novodental.ortodoncia.Alambre;




@Entity
@Access(value = AccessType.FIELD)
@DiscriminatorValue("Alambre")
public class AlambreConId extends MaterialConId implements Alambre {
	
	@Column( name = "DIAMETRO")
	private float diametroMilimetro;
	@Column( name = "LONGITUD")
	private int longitudCentimetro;
	
	public AlambreConId() {
		super();
	}
	
	public AlambreConId(int id, float precio) {
		super(id, precio);
	}

	

	public AlambreConId(int id, float precio, float diametroMilimetro, int longitudCentimetro) {
		super(id, precio);
		this.diametroMilimetro = diametroMilimetro;
		this.longitudCentimetro = longitudCentimetro;
	}



	public float getDiametroMilimetro() {
		return diametroMilimetro;
	}

	public void setDiametroMilimetro(float diametroMilimetro) {
		this.diametroMilimetro = diametroMilimetro;
	}

	public int getLongitudCentimetro() {
		return longitudCentimetro;
	}

	public void setLongitudCentimetro(int longitudCentimetro) {
		this.longitudCentimetro = longitudCentimetro;
	}

	@Override
	public String toString() {
		return "AlambreConId [diametroMilimetro=" + diametroMilimetro + ", longitudCentimetro=" + longitudCentimetro
				+ "]";
	}
	
			

	

}
