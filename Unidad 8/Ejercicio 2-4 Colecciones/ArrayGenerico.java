//@ProfitCoder          16:35      06/05/2026

import java.util.Arrays;

public class ArrayGenerico<T>{
	//Atributos
	private T[] array1;
	
	//Constructor
	
	/*
		Nos va a dar un aviso si en el constructor hacemos asi el constructor,
		Para que no haya Warnings sobre lo que estoy haciendo.
	*/
	
	
	@SuppressWarnings("unchecked")
	public ArrayGenerico(int tam){
//		array1 = new T [tam];						Da error, por lo que hay que hacer el ejemplo de abajo, que se hace un Casting y se llama a Object (Padre)
		array1 = (T[]) new Object[tam];
	}
	
	//Metodos
	public int buscarValor(T valor) {
		int posicion = -1;
		boolean encontrado = false;

		for (int i = 0; i < array1.length && !encontrado; i++) {
			if (array1[i] != null && array1[i].equals(valor)) {
				posicion = i;
				encontrado = true;
			}
		}

		return posicion;
	}
	
	//Metodo para añadir elementos al array
	public void guardarValor(int pos, T valor){
		array1[pos] = valor;
	}
	
	public T consultarValor(int pos){
		return array1[pos];
	}
	
	public void anadirElemento(T valor) throws Exception {
		boolean estaInsertado = false;
		
		for (int i = 0; i < array1.length && estaInsertado != true; i++) {
			if (array1[i] == null) {
				array1[i] = valor;
				estaInsertado = true;
			}
		}
		
		if(estaInsertado == false){
			throw new Exception("El array está lleno");
		}
	}
	
	@Override
	public String toString(){
		return Arrays.toString(array1);
	}
	
	//Metodo Main
	public static void main(String [] args){
		try{	
			//Crear un ArrayGenerico de 10 Integer
			ArrayGenerico <Integer> array1 = new ArrayGenerico <>(10);
			
			//Guarda el valor 50 en la posición 0 y el valor 30 en la posición 1.
			array1.guardarValor(0,50);
			array1.guardarValor(1,30);
			
			//Muestra el contenido del ArrayGenerico.
			System.out.println(array1);
			
			//Busca el valor 20 (Debe de indicar que no está).
			System.out.println("Posición del valor 20: " + array1.buscarValor(20));
			
			//Busca el valor 30 (Debe indicar que está en la posición 1).
			System.out.println("Posición del valor 30: " + array1.buscarValor(30));
			
			//Añade el valor 100 en el primer hueco libre.
			array1.anadirElemento(100);
			
			//Muestra todos los valores por pantalla con el siguiente formato
			
			System.out.println("**** Valores ****");
			
			for (int i = 0; i < 10; i++) {
				System.out.println(array1.consultarValor(i));
			}
		}catch (Exception e){
			System.out.println(e);
		}
	}
}




/*

a) ¿Has encontrado algún problema al manejar clases genéricas?

	La verdad que he encontrado problemas a la hora de manejar las clases genericas, ya que
	no sabia como hacer el constructor y he tenido que consultar con fuentes externas como se realizaba
	viendo asi que he usado Object para poder hacer el constructor generico.

b) Prueba a llenar el ArrayGenerico y a añadir un nuevo valor. ¿Qué ocurre?

	Que lanza una excepción debido a que el array ya esta lleno, y no entran más valores.

c) ¿Existe alguna forma de añadir un valor si el array está lleno?

	Se podria hacer de una manera, si se sustituyese un valor de los que hay dentro del array por el nuevo
	que se quiere elegir, indicando tanto la posición como el valor nuevo.

*/
