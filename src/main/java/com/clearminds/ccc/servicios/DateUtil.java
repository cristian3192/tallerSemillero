package com.clearminds.ccc.servicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
public static final String FORMATO_COMPLETO = "yyyy-MM-dd HH:mm:ss" ;  //Constante con la palabra reservada final para acceder desde main
	
	// estatico pertenece a la clase, no hace falta instanciar , se invoca a traves de la clase
	public static String obtenerFecha(Date fecha) {			
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_COMPLETO);
		String texto = sdf.format(fecha);
		
		return texto;
	}

}
