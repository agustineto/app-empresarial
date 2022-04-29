/**
 * 
 */
package com.code.services;

import java.util.ArrayList;
import java.util.List;

import com.code.entity.*;

/**
 * @author Agustin Zavala
 * Clase que ejecuta la logica de negocio de Empleados
 *
 */
public class EmpleadoService {
	

	/**
	 * @author Agustin Zavala
	 * Metodo que retorna lista de empleados
	 *{@link Empleado}
	 */
	public List<Empleado> listaEmpleados() {
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoApple = new Empleado();
		Empleado empleadoMicorsoft = new Empleado();
		
		empleadoIBM.setNombre("Agustin");
		empleadoIBM.setApellido("Zavala");
		empleadoIBM.setPuesto("Developer");
		empleadoIBM.setEstatus(true);
		
		empleadoMicorsoft.setNombre("Bill");
		empleadoMicorsoft.setApellido("Gates");
		empleadoMicorsoft.setPuesto("CEO");
		empleadoMicorsoft.setEstatus(true);
		
		
		empleados.add(empleadoMicorsoft);
		empleados.add(empleadoIBM);
		
		
		return empleados;
	}

}
