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