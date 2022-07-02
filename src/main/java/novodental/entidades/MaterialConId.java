package novodental.entidades;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import novodental.ortodoncia.Material;


@Entity
@Table(name = "MATERIALES")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO_MATERIAL", discriminatorType = DiscriminatorType.STRING)
public class MaterialConId extends Material {
	
	@Id
	@GeneratedValue
	private int id;
	private float precio;
	
	@Column(nullable = true)
	private int cantidad ;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ORTODONCIA", referencedColumnName = "id")
	private OrtodonciaConId ortodoncia;
	
	public MaterialConId() {
		super();
	}
	
	public MaterialConId(int id, float precio) {
		super();
	}
	
	public OrtodonciaConId getOrtodoncia() {
		return ortodoncia;
	}

	public void setOrtodoncia(OrtodonciaConId ortodoncia) {
		this.ortodoncia = ortodoncia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	
}