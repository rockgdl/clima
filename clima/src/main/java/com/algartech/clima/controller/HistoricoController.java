package com.algartech.clima.controller;
/**
 * Author fpiceno
 * Clase controller expone algunas rutas para su posterior manejo, metodos add , latest
 * el cual recibe como parametro el nombre de la ciudad a guardar en la Base de datos
 * 
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.algartech.clima.entity.Historico;
import com.algartech.clima.repository.HistoricoRepositoryDao;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController 
@RequestMapping(path="/historico") 
@Api(value = "HistoricoController", description = "Operaciones relacionadas con el histórico")
public class HistoricoController {

	
	  	private final HistoricoRepositoryDao historicoRepository;

	    @Autowired
	    public HistoricoController(HistoricoRepositoryDao historicoRepository) {
	        this.historicoRepository = historicoRepository;
	    }
  
  /*
   * metodo addNewHistorico que recibe como parametro el nombre de la ciudad 
   * se inserta en la base de datos 
   * */
  @PostMapping(path="/add") 
  @ApiOperation(value = "Añadir nuevo historico", response = String.class)
  public @ResponseBody String addNewHistorico (@RequestBody Historico request) {
	  Historico n = new Historico();
	  n.setCiudad(request.getCiudad());
	  try {
		  historicoRepository.save(n);
	  }catch(Exception e) {
		  e.printStackTrace();
		  return e.getMessage();
	  }
  
 
    return "Saved";
  }

  @GetMapping(path="/latest")
  @ApiOperation(value = "Obtener los ultimos históricos", response = Iterable.class)
  public @ResponseBody Iterable<Historico> getAllHistorico() {

    return historicoRepository.findFirst10ByOrderByHistoricoIDDesc();
  } 
}
