package novodental.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import novodental.entidades.MaterialConId;

@RepositoryRestResource(path = "materiales", itemResourceRel = "material", collectionResourceRel = "materiales")
public interface MaterialDAO extends JpaRepository<MaterialConId, Integer>{

}
