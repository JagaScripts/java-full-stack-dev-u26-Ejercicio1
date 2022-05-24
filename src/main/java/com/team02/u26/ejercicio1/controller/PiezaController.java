/**
 * u26-Ejercicio1 - com.team02.u26.ejercicio1.controller - PiezaController
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 24/05/2022
 */
package com.team02.u26.ejercicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team02.u26.ejercicio1.dto.Pieza;
import com.team02.u26.ejercicio1.service.PiezaServiceImpl;

/**
 * PiezaController.java
 *
 */
@RestController
@RequestMapping("/piezas")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/")
	public List<Pieza> listarPiezas(){
		return piezaServiceImpl.listarPiezas();
	}
	
	
	@PostMapping("/")
	public Pieza salvarPieza(@RequestBody Pieza pieza) {
		
		return piezaServiceImpl.guardarPieza(pieza);
	}
	
	
	@GetMapping("/{codigo}")
	public Pieza piezaXID(@PathVariable(name="codigo") int codigo) {
		
		Pieza pieza_xid= new Pieza();
		
		pieza_xid=piezaServiceImpl.piezaXCodigo(codigo);
		
		
		return pieza_xid;
	}
	
	@PutMapping("/{codigo}")
	public Pieza actualizarPieza(@PathVariable(name="codigo")int codigo,@RequestBody Pieza piezas) {
		
		Pieza pieza_seleccionado= new Pieza();
		Pieza pieza_actualizado= new Pieza();
		
		pieza_seleccionado= piezaServiceImpl.piezaXCodigo(codigo);
		
		pieza_seleccionado.setNombre(piezas.getNombre());
		
		pieza_actualizado = piezaServiceImpl.actualizarPieza(pieza_seleccionado);
		
		
		return pieza_actualizado;
	}
	
	@DeleteMapping("/{codigo}")
	public void eliminarPieza(@PathVariable(name="codigo")int codigo) {
		piezaServiceImpl.eliminarPieza(codigo);
	}
	
}
