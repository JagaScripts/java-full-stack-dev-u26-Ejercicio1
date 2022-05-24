package com.team02.u26.ejercicio1.service;

import java.util.List;

import com.team02.u26.ejercicio1.dto.Pieza;

public interface IPiezaService {
	
	//Metodos del CRUD
	public List<Pieza> listarPiezas();
	
	public Pieza guardarPieza(Pieza pieza);	
	
	public Pieza piezaXCodigo(int codigo); 
	
	public Pieza actualizarPieza(Pieza pieza);
	
	public void eliminarPieza(int codigo);
}
