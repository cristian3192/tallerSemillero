package com.clearminds.ccc.bdd.test;

import com.clearminds.ccc.dtos.Estudiante;
import com.clearminds.ccc.excepciones.BDDException;
import com.clearminds.ccc.servicios.ServicioEstudiante;

public class TestActualizar {

	public static void main(String[] args) {
	ServicioEstudiante srvEstudiante = new ServicioEstudiante();
	try {
		srvEstudiante.actualizarEstudiante(new Estudiante("Pedro", "Navas",2));
	} catch (BDDException e) {
		e.printStackTrace();
		e.getMessage();
	}

	}

}
