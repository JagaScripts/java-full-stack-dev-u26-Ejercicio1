/**
 * u26-Ejercicio1 - com.team02.u26.ejercicio1.service - SuministraServiceImpl
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 24/05/2022
 */
package com.team02.u26.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team02.u26.ejercicio1.dao.ISuministraDAO;
import com.team02.u26.ejercicio1.dto.Suministra;

/**
 * SuministraServiceImpl.java
 *
 */
@Service
public class SuministraServiceImpl implements ISuministraService {

	@Autowired
	ISuministraDAO iSuministraDAO;
	
	@Override
	public List<Suministra> listarSuministra() {
		
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) {
		
		return iSuministraDAO.save(suministra);
	}

	@Override
	public Suministra suministraXID(int id) {
		
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		
		return iSuministraDAO.save(suministra);
	}

	@Override
	public void eliminarSuministra(int id) {
		iSuministraDAO.deleteById(id);		
	}

}
