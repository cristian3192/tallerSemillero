package com.clearminds.ccc.servicios;


import com.clearminds.ccc.dtos.Estudiante;
import com.clearminds.ccc.excepciones.BDDException;

public class ServicioEstudiante  extends ServicioBase{
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		abrirConexion();
		System.out.println("Insertando Estudiante: "+ estudiante);
		cerrarConexion();
		
	}

}
