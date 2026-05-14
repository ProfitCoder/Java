//ProfitCoder      12:30       08/05/2026

import javax.swing.JOptionPane;
import java.util.HashSet;

public class EjercicioOptionPane{
	
	/*
	//Metodos
	@Override
	public int HashCode(){
		return valor.hashCode();
	}
	
	@Override
	public boolean equals(Object obj){
		boolean iguales = false;
		
		if(valor ){
			
		}
		
		
		return iguales;
	}
	*/
	
	public boolean estaNumero(int valor){
		boolean
	}
	
	public static void main(String [] args){
		//Creacion de Variables
		int solucion = 0,numIntro = 1;
		String valor, mostrarFinal = "";
		HashSet <Integer> coleccion = new HashSet<>();
		
		//Pedir los valores
		for(int i = 0;i < coleccion.size();i++){
			boolean esta = false;
			
			valor = JOptionPane.showInputDialog("Dime números enteros. (" + numIntro + "/5): ");
			
			if(valor == valor){
				
			}
			
			if(esta != true){
				coleccion.add((Integer.parseInt(valor)));
				numIntro ++;
			}
			else{
				valor = JOptionPane.showInputDialog("Número Duplicado, Prueba otra vez. (" + numIntro + "/5): ");
			}
		}
		
		for(Integer i : coleccion){
			solucion += i; 
		}
		
		//Mostramos la solución
		JOptionPane.showMessageDialog(null, "La suma de los numeros introducidos es " + solucion);
	}
}