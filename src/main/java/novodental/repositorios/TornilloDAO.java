package novodental.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import novodental.entidades.TornilloConId;


@RepositoryRestResource(path = "tornillos", itemResourceRel = "tornillo", collectionResourceRel = "tornillo")
public interface TornilloDAO extends JpaRepository<TornilloConId, Integer>{

}

