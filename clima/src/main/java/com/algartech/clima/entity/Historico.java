package com.algartech.clima.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "historico", schema = "clima")
public class Historico {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "historicoID")
	  private Integer historicoID;

	  private String ciudad;

	public Integer getHistoricoID() {
		return historicoID;
	}

	public void setHistoricoID(Integer historicoID) {
		this.historicoID = historicoID;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


}
