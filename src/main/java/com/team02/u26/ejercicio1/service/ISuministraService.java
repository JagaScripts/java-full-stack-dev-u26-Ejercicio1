/**
 * u26-Ejercicio1 - com.team02.u26.ejercicio1.service - ISuministraService
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 24/05/2022
 */
package com.team02.u26.ejercicio1.service;

import java.util.List;

import com.team02.u26.ejercicio1.dto.Suministra;

/**
 * ISuministraService.java
 *
 */
public interface ISuministraService {

	//Metodos del CRUD
			public List<Suministra> listarSuministra();
			
			public Suministra guardarSuministra(Suministra suministra);	
			
			public Suministra suministraXID(int id); 
			
			public Suministra actualizarSuministra(Suministra suministra);
			
			public void eliminarSuministra(int id);
	
}
