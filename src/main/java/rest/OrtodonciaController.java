package rest;

import java.time.Instant;
import java.util.List;


import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import novodental.entidades.OrtodonciaConId;
import novodental.repositorios.OrtodonciaDAO;

@RepositoryRestController
//@CrossOrigin(origins = "https://novodental.herokuapp.com/api/")
public class OrtodonciaController {
	
	private OrtodonciaDAO ortodonciaDAO;
	
	public OrtodonciaController(OrtodonciaDAO ortodonciaDAO) {
		this.ortodonciaDAO = ortodonciaDAO;
	}

	
	@GetMapping("/ortodoncias/search/con-fecha-salida-posterior-a")
	@ResponseBody
	public CollectionModel<PersistentEntityResource> getOrtodociasConFechaSalidaPosterior(@RequestParam("fecha") Instant fechaSalida, 
			PersistentEntityResourceAssembler assembler) {
		
		List<OrtodonciaConId> ortodoncias = ortodonciaDAO.getOrtodociasConFechaSalidaPosterior(fechaSalida);
		return assembler.toCollectionModel(ortodoncias);
		
	}
	
	
}
