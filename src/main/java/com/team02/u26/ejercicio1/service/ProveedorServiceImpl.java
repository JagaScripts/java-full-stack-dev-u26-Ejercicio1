/**
 * u26-Ejercicio1 - com.team02.u26.ejercicio1.service - ProveedorServiceImpl
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
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.team02.u26.ejercicio1.dao.IPiezaDAO;
import com.team02.u26.ejercicio1.dao.IProveedorDAO;
import com.team02.u26.ejercicio1.dto.Proveedor;

/**
 * ProveedorServiceImpl.java
 *
 */
@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	IProveedorDAO iProveedorDAO;

	
	@Override
	public List<Proveedor> listarProveedores() {
	
	return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor proveedor) {

		return iProveedorDAO.save(proveedor);
	}

	@Override
	public Proveedor proveedorXID(String id) {
		
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {

		return iProveedorDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedor(String id) {
		iProveedorDAO.deleteById(id);
		
	}

}
