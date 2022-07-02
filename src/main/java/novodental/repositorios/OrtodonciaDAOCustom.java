package novodental.repositorios;

import java.time.Instant;
import java.util.List;



import novodental.entidades.OrtodonciaConId;

public interface OrtodonciaDAOCustom {
	
	List<OrtodonciaConId> getOrtodociasConFechaSalidaPosterior(Instant fechaSalida);

}
