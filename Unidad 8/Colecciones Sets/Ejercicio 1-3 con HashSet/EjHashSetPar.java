//Guardar objetos de la clase Par en un HashSet

import java.util.HashSet;

public class EjHashSetPar{	
	public static void main(String [] args){		
		//Conjunto para guardar los objetos
		HashSet <Par> pares = new HashSet<>();
		
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