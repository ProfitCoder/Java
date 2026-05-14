//Guardar objetos Usando TreeSet

import java.util.TreeSet;

/*
	Si ejecutamos nos compila pero no funciona, esto ocurre porque 
	hace falta añadir para que todo vaya bien la interfaz comparable
*/

public class EjTreeSetPar{	
	public static void main(String [] args){		
		//Conjunto para guardar los objetos
		TreeSet <Par> pares = new TreeSet<>();
		
		//Guardamos dos pares en el conjunto
		Par par1 = new Par("Madrid",25);
		Par par2 = new Par("Barcelona",19);
		Par par3 = new Par("Barcelona",19);
		
		pares.add(par1);
		pares.add(par2);
		pares.add(par3);
		
		//Mostramos valores con un for-each
		for(Par i : pares){
			System.out.println(i);
		}
		
		}
}