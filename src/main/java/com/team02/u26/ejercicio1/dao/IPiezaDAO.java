/**
 * u26-Ejercicio1 - com.team02.u26.ejercicio1.dao - IPiezaDAO
 *
 * @author Daniel Fernández Cacho
 * @author Joan Hurtado García
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 17/05/2022
 */
package com.team02.u26.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team02.u26.ejercicio1.dto.Pieza;

/**
 * IPiezaDAO.java
 *
 */
public interface IPiezaDAO extends JpaRepository<Pieza, Integer> {

}
