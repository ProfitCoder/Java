//Primer ejemplo de uso de colecciones (HashSet)

import java.util.HashSet;

public class EjHashSet{
	public static void main(String [] args){
		//Creo el objeto HashSet
		HashSet <Integer> pares = new HashSet<>();
		
		/*
			Al ser numeros muy pequeños, salen en orden
			pero si multiplicamos por 10 pues comprobemoslo:
		*/
		
		//Almacenar los pares en [1-100]
		for(int i = 0;i <= 100;i++){
			if(i%2 == 0){
				pares.add(i*10);
			}
		}
		
		//Mostrar colección for-each		
		System.out.println("\nNúmeros del 1 al 100: \n");
		
		for(Integer i : pares){
			System.out.println(i);
		}
	}
}