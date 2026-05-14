//ProfitCoder      8:53        14/05/2026

import java.util.LinkedList;

public class historialNavegador{
	public static void main(String [] args){
		//Creation of colection that acts like a stack
		LinkedList <String> historial = new LinkedList<>();
		
		//Add pages by order of search
		historial.addFirst("https://www.google.com");
		historial.addFirst("wikipedia.org/Java");
		historial.addFirst("stackoverflow.com");
		historial.addFirst("github.com");
		//we made it like that to made it like a stack style
		
		//Now we wanna know what the actual page is without loosing it
		System.out.println();
		System.out.println("Página actual: " + historial.peekFirst());
		
		//Delete the last page, the oldest onefor restriction of size
		historial.removeLast();
		/*
		Also, we can use:
		historial.remove(historial.size()-1);
		*/
		
		//Butom to go back
		
		/*
		System.out.printf("Saliendo de %s, volviendo a %s\n",historial.removeFirst();,historial.peekFirst);
		historial.add(historial.removeFirst(););
		*/
		
		//Also we can use:
		System.out.printf("Saliendo de %s, volviendo a %s\n",historial.removeFirst(),historial.peekFirst());
		
		//Print Historial
		for(String s : historial){
			System.out.println(s);
		}
	}
}
