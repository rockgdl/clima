package com.algartech.clima.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "historico", schema = "clima")
public class Historico {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name = "historicoID")
	  private Integer historicoID;

	  private String ciudad;
	  private Double temperatura;

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

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Historico [historicoID=" + historicoID + ", ciudad=" + ciudad + ", temperatura=" + temperatura + "]";
	}

	
	
	
	

}
