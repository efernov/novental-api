package novodental.repositorios;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import novodental.entidades.OrtodonciaConId;

//@Transactional(readOnly = true)
public class OrtodonciaDAOImpl implements OrtodonciaDAOCustom {

	
	OrtodonciaDAO ortodonciaDAO;
	
	@Autowired
	public OrtodonciaDAOImpl(@Lazy OrtodonciaDAO ortodonciaDAO) {
		this.ortodonciaDAO = ortodonciaDAO;
	}
	

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<OrtodonciaConId> getOrtodociasConFechaSalidaPosterior(Instant fechaSalida) {
		List<OrtodonciaConId> ortodoncias = ortodonciaDAO.findAll().stream()
				.filter(j -> j.getFechaSalida().isAfter(fechaSalida)).collect(Collectors.toList());
		return ortodoncias;

	}

}
