package novodental.entidades;

import java.time.Instant;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import novodental.ortodoncia.Material;
import novodental.ortodoncia.Ortodoncia;

@Entity
@Table(name = "ORTODONCIAS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class OrtodonciaConId extends Ortodoncia {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tipoTrabajo;
	private Instant fechaEntrada;
	private Instant fechaSalida;
	private float importeOrtodoncia;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = MaterialConId.class, mappedBy = "ortodoncia")
	private List<Material> materiales;
	
	public OrtodonciaConId() {
		super();
	}
	
	public OrtodonciaConId(String tipoTrabajo, Instant fechaEntrada, Instant fechaSalida, float importeOrtodoncia) {
		super(tipoTrabajo, fechaEntrada, fechaSalida, importeOrtodoncia);
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String getTipoTrabajo() {
		// TODO Auto-generated method stub
		return tipoTrabajo;
	}

	@Override
	public void setTipoTrabajo(String tipoTrabajo) {
		// TODO Auto-generated method stub
		this.tipoTrabajo = tipoTrabajo;
	}
	
	public Instant getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Instant fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Instant getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Instant fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	
	public float getImporteOrtodoncia() {
		return importeOrtodoncia;
	}

	public void setImporteOrtodoncia(float importeOrtodoncia) {
		this.importeOrtodoncia = importeOrtodoncia;
	}

	public List<Material> getMateriales() {
		return materiales;
	}

	public void setMateriales(List<Material> materiales) {
		this.materiales = materiales;
	}

	public void addMaterialConId(MaterialConId material) {
		getMateriales().add(material);
		material.setOrtodoncia(this);
	}

//	public float getImporte() {
//		float resultado = 0;
//		for (Material material : materiales) {
//			resultado += material.getPrecio();	
//		} 
//		return resultado;
//	}
}
