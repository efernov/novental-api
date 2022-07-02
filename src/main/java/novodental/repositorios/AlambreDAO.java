package novodental.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import novodental.entidades.AlambreConId;


@RepositoryRestResource(path = "alambres", itemResourceRel = "alambre", collectionResourceRel = "alambres")
public interface AlambreDAO extends JpaRepository<AlambreConId, Integer>{

}
