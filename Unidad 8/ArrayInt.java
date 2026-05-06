//@ProfitCoder        16:00         06/05/2026

import java.util.Arrays;

public class ArrayInt{
	//Atributos
	private final int TAM;
	private int[] numeros;
	private int pos = 0, valor = 0;
	
	
	//Constructores
	public ArrayInt(int TAM){
		this.TAM = TAM;
		numeros = new int[TAM];
	}
	
	//Metodos
	public void guardarValor(int pos,int valor){
		numeros [pos] = valor;
	}
	
	public int consultarValor(int pos){
		return numeros[pos];
	}
	
	@Override
	public String toString(){
		return Arrays.toString(numeros);
	}
}