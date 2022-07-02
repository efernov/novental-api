package novodental.repositorios;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import novodental.entidades.OrtodonciaConId;


@RepositoryRestResource(path = "ortodoncias", itemResourceRel = "ortodoncia", collectionResourceRel = "ortodoncias")
public interface OrtodonciaDAO extends JpaRepository<OrtodonciaConId, Integer>, OrtodonciaDAOCustom {
	
	@RestResource(path ="por-tipo-de-trabajo")
	List<OrtodonciaConId> findByTipoTrabajo(@Param("tipoTrabajo")String txt);
//	
//	public List<OrtodonciaConId> findAll(Specification<OrtodonciaConId> specification);

}
