/**
 * u26-Ejercicio1 - com.team02.u26.ejercicio1.controller - ProveedorController
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

import com.team02.u26.ejercicio1.dto.Proveedor;
import com.team02.u26.ejercicio1.service.ProveedorServiceImpl;

/**
 * ProveedorController.java
 *
 */
@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

	
	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/")
	public List<Proveedor> listarProveedores(){
		return proveedorServiceImpl.listarProveedores();
	}
	
	
	@PostMapping("/")
	public Proveedor salvarProveedor(@RequestBody Proveedor proveedor) {
		
		return proveedorServiceImpl.guardarProveedor(proveedor);
	}
	
	
	@GetMapping("/{id}")
	public Proveedor proveedorXID(@PathVariable(name="id")String id) {
		
		Proveedor pieza_xid= new Proveedor();
		
		pieza_xid=proveedorServiceImpl.proveedorXID(id);
		
		
		return pieza_xid;
	}
	
	@PutMapping("/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name="id")String id,@RequestBody Proveedor proveedor) {
		
		Proveedor proveedor_seleccionado = new Proveedor();
		Proveedor proveedor_actualizado= new Proveedor();
		
		proveedor_seleccionado= proveedorServiceImpl.proveedorXID(id);
		
		proveedor_seleccionado.setNombre(proveedor.getNombre());
		
		proveedor_actualizado = proveedorServiceImpl.actualizarProveedor(proveedor_seleccionado);
		
		
		return proveedor_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarProveedor(@PathVariable(name="id")String id) {
		proveedorServiceImpl.eliminarProveedor(id);
	}
}
