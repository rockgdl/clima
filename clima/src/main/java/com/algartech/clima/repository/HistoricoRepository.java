package com.algartech.clima.repository;
import org.springframework.data.repository.CrudRepository;

import com.algartech.clima.entity.Historico;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface HistoricoRepository extends CrudRepository<Historico, Integer> {

}