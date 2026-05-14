//ProfitCoder 		15:45         08/05/2026

import java.util.HashSet;

public class ControlAsistencia{			
	public static void main(String [] args){
		//Creamos la coleccion
		HashSet <String> nombresAlumnos = new HashSet<>();
		
		//Añadir un intro antes de mostrarlos
		System.out.println();
		
		//Nombres de Alumnos de clase añadidos a la coleccion
		nombresAlumnos.add("Pablo");
		nombresAlumnos.add("Jose");
		nombresAlumnos.add("Fran");
		nombresAlumnos.add("Alex");
		
		//Añadimos el duplicado
		nombresAlumnos.add("Fran");
		
		//Los mostramos por pantalla con un for-each
		for(String i : nombresAlumnos){
			System.out.println(i);
		}
 	}
}

/*
Al ser un HashSet de un objeto que existe ya (String, Integer, Character...)
es decir, no es un objeto creado por nosotros.
Este tipo de datos ya tienen por defecto tanto el HashCode,
como el metodo equals, que habria que sobreescribir si no lo tuvieran
ya de por sí. Eh ahí el porque de que en este ejercicio no se haga
ese @Override a estos metodos.
*/