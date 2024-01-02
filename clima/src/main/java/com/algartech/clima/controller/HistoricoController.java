package com.algartech.clima.controller;

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


@RestController //This means that this class is a Controller
@RequestMapping(path="/historico") // This means URL's start with /demo (after Application path)
public class HistoricoController {

	
	  private final HistoricoRepositoryDao historicoRepository;

	    @Autowired
	    public HistoricoController(HistoricoRepositoryDao historicoRepository) {
	        this.historicoRepository = historicoRepository;
	    }
  
  
  @PostMapping(path="/add") 
  public @ResponseBody String addNewHistorico (@RequestBody Historico request) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request
	  System.out.println("entrando a ver el historico"+request);
    Historico n = new Historico();
    n.setCiudad(request.getCiudad());
  
    historicoRepository.save(n);
 
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Historico> getAllHistorico() {
    // This returns a JSON or XML with the users
    return historicoRepository.findAll();
  } 
}
