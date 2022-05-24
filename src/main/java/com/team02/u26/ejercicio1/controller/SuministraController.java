/**
 * u26-Ejercicio1 - com.team02.u26.ejercicio1.controller - SuministraController
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

import com.team02.u26.ejercicio1.dto.Suministra;
import com.team02.u26.ejercicio1.service.SuministraServiceImpl;

/**
 * SuministraController.java
 *
 */
@RestController
@RequestMapping("/suministros")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraServiceImpl;
	
	@GetMapping("/")
	public List<Suministra> listarSuministros(){
		return suministraServiceImpl.listarSuministra();
	}
	
	
	@PostMapping("/")
	public Suministra salvarSuministro(@RequestBody Suministra suministro) {
		
		return suministraServiceImpl.guardarSuministra(suministro);
	}
	
	
	@GetMapping("/{id}")
	public Suministra suministroXID(@PathVariable(name="id") int id) {
		
		Suministra suministro_xid= new Suministra();
		
		suministro_xid=suministraServiceImpl.suministraXID(id);
		
		
		return suministro_xid;
	}
	
	@PutMapping("/{id}")
	public Suministra actualizarSuministro(@PathVariable(name="id")int id,@RequestBody Suministra suministra) {
		
		Suministra suministra_seleccionado = new Suministra();
		Suministra suministra_actualizado = new Suministra();
		
		suministra_seleccionado = suministraServiceImpl.suministraXID(id);
		
		suministra_seleccionado.setPrecio(suministra.getPrecio());
		
		suministra_actualizado = suministraServiceImpl.actualizarSuministra(suministra_seleccionado);
		
		
		return suministra_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarSuministro(@PathVariable(name="id")int id) {
		suministraServiceImpl.eliminarSuministra(id);
	}
	
}
