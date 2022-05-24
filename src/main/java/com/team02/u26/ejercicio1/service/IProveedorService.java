/**
 * u26-Ejercicio1 - com.team02.u26.ejercicio1.service - IProveedorService
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 24/05/2022
 */
package com.team02.u26.ejercicio1.service;

import java.util.List;

import com.team02.u26.ejercicio1.dto.Proveedor;

/**
 * IProveedorService.java
 *
 */
public interface IProveedorService {
	
	//Metodos del CRUD
		public List<Proveedor> listarProveedores();
		
		public Proveedor guardarProveedor(Proveedor proveedor);	
		
		public Proveedor proveedorXID(String id); 
		
		public Proveedor actualizarProveedor(Proveedor proveedor);
		
		public void eliminarProveedor(String id);

}
