/**
 * u26-Ejercicio1 - com.team02.u26.ejercicio1.dto - Proveedor
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 17/05/2022
 */
package com.team02.u26.ejercicio1.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * Proveedor.java
 *
 */
@Entity
@Table(name="proveedores")
public class Proveedor {

	@Id
	private String id;
	
	private String nombre;

	/**
	 * 
	 */
	public Proveedor() {
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Proveedor(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
