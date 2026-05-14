
import java.util.ArrayList;

public class Podio{
	public static void main(String [] args){
		//Creacion de variables
		int contador = 0;
		
		//a) Instancia un ArrayList de tipo String llamado clasificacion.
		ArrayList <String> clasificacion = new ArrayList<>();
		
		
		/*b) Añade en este orde, a los siguientes jugadores al final de la lista
		"Ana", "Carlos","Beatriz","David", "Elena"*/
		clasificacion.add("Ana");
		clasificacion.add("Carlos");
		clasificacion.add("Beatriz");
		clasificacion.add("David");
		clasificacion.add("Elena");
		
		mostrarClasificacion(clasificacion);
		
		/*c) El imprevisto: hubo un error de arbitraje. Resulta que "Beatriz" hizo trampa
		Elimínala de la lista usando su nombre (no su índice)*/
		
		clasificacion.remove("Beatriz");
		System.out.println("Se elimina a Beatriz");
		mostrarClasificacion(clasificacion);
		
		/*d) La remontada: "David" acaba de ganar una partida espectacular y sube a la
		primera posicion. Mueve a "David" al índice 0 sin borrar a "Ana" */
		clasificacion.remove("David");
		clasificacion.add(0,"David");
		mostrarClasificacion(clasificacion);
		
		/*e) El reemplazo: "Carlos" se retira del torneo por problemas técnicos y es sustituido por
		"Zacarías" Reemplaza el valor en la posición de Carlos por "Zacarías" usando el método
		.set(). */
		
		//clasificacion.remove("David");
		//clasificacion.add(2,"Zacarías");
		
		//Oh podemos optimizarlo usando el metodo set().
		clasificacion.set(clasificacion.indexOf("Carlos"),"Zacarías");
		System.out.println("\nAsi queda la clasificación con Carlos sustituido por Zacarías");
		mostrarClasificacion(clasificacion);
		
		/*f) Imprime por consola el podio (los 3 primeros jugadores) usando un bucle for clásico y el
		método .get(i).*/
		System.out.println("**** Podio Final ****");
		for(int i = 0;i < 3; i++){
			System.out.println("%d. --> %s\n",i+1,clasificacion.get(i));
		}
		
		/*g) ¿Cambiaría el problema si usamos LinkedList en lugar de ArrayList? ¿Cuál sería el cambio?
		Si lo podemos cambiar en lo unico en lo que varia es en
		cuestion de eficiencia
		*/
	}
	
	public static void mostrarClasificacion(ArrayList <String> array){
		
		System.out.println();
		System.out.println("***** Podium Temporal ****");
		for(int i = 0;i < 3;i++){
			System.out.printf("%d. --> %s\n",i+1,array.get(i));
		}
	}
}