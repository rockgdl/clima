package com.algartech.clima.model;

import javax.persistence.*;

public class WeatherResponse {

	@Id
    private long id;
	
	private String name;
	private Main main;
  
	
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public static class Main {
        private Double temp;

        public Double getTemp() {
            return temp;
        }

        public void setTemp(Double temp) {
            this.temp = temp;
        }

		@Override
		public String toString() {
			return "Main [temp=" + temp + "]";
		}
        
        
    }

	@Override
	public String toString() {
		return "WeatherResponse [id=" + id + ", name=" + name + ", main=" + main + "]";
	}
    
    
}
