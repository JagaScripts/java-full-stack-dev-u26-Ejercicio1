/**
 * u26-Ejercicio1 - com.team02.u26.ejercicio1.dto - Suministra
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 17/05/2022
 */
package com.team02.u26.ejercicio1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Suministra.java
 *
 */
@Entity
@Table(name = "suministra")
public class Suministra {

	// Atributos de entidad registro_curso
	@Id
	private int id;

	
	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	Proveedor proveedor;

	@ManyToOne
	@JoinColumn(name = "codigo_pieza")
	Pieza pieza;


	@Column(name = "precio") // no hace falta si se llama igual
	private int precio;

	

	/**
	 * 
	 */
	public Suministra() {
	}


	/**
	 * @param id
	 * @param proveedor
	 * @param pieza
	 * @param precio
	 */
	public Suministra(int id, Proveedor proveedor, Pieza pieza, int precio) {
		this.id = id;
		this.proveedor = proveedor;
		this.pieza = pieza;
		this.precio = precio;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the proveedor
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}


	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}


	/**
	 * @return the pieza
	 */
	public Pieza getPieza() {
		return pieza;
	}


	/**
	 * @param pieza the pieza to set
	 */
	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}


	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Suministra [id=" + id + ", proveedor=" + proveedor + ", pieza=" + pieza + ", precio=" + precio + "]";
	}
	
	

}
