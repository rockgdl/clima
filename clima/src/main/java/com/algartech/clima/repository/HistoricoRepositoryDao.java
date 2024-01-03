package com.algartech.clima.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.algartech.clima.entity.Historico;


public interface HistoricoRepositoryDao  extends JpaRepository<Historico, Long>  {
	
	// Método para obtener las últimas 10 entidades ordenadas por historicoID de forma descendente
    List<Historico> findFirst10ByOrderByHistoricoIDDesc();

}
