/**
 * 
 */
package com.code.controllers;
import com.code.entity.Empleado;
import com.code.services.EmpleadoService;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Agustin
 * Procesa informacion para la clase de pantalla principal
 *
 */


@ManagedBean
@ViewScoped
public class PrincipalController {
	
	private List<Empleado> empleados;
	
	/***
	 * 
	 * Servicio con los metodos que realizan la logica de negocio de empleados.
	 * */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	@PostConstruct
	public void init() {
		this.consultaEmpleados();
		
	}
	
	public void consultaEmpleados() {
		this.empleados = this.empleadoService.listaEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
	

}
