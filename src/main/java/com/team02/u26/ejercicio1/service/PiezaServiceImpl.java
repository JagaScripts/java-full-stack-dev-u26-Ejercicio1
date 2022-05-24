/**
 * u26-Ejercicio1 - com.team02.u26.ejercicio1.service - PiezaServiceImpl
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

import com.team02.u26.ejercicio1.dao.IPiezaDAO;
import com.team02.u26.ejercicio1.dao.ISuministraDAO;
import com.team02.u26.ejercicio1.dto.Pieza;
import com.team02.u26.ejercicio1.dto.Suministra;

/**
 * PiezaServiceImpl.java
 *
 */
@Service
public class PiezaServiceImpl implements IPiezaService{

	@Autowired
	IPiezaDAO iPiezaDAO;
	
	@Override
	public List<Pieza> listarPiezas() {
		
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza piezaXCodigo(int codigo) {
		
		return iPiezaDAO.findById(codigo).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(int codigo) {
		iPiezaDAO.deleteById(codigo);		
	}
	
}
