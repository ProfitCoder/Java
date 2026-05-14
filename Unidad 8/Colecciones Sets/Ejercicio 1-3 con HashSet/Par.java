//@ProfitCoder        13:04          06/05/2026

public class Par implements Comparable<Par>{    //Temenos que añadir la intefaz para el TreeSet
	//Atributos
	private String clave;
	private int valor;
	
	//Constructor
	public Par(String clave,int valor){
		this.clave = clave;
		this.valor = valor;
	}
	
	//Metodos
	public String getClave(){
		return clave;
	}
	
	public int getValor(){
		return valor;
	}
	
	public void setClave(String clave){
		this.clave = clave;
	}
	
	public void setValor(int valor){
		this.valor = valor;
	}
	
	@Override
	public String toString(){
		return String.format("{%s,%d}",clave,valor);
	}
	
	//Para que funcione el ejercicio EjHashSetPar.java tenemos que sobre escribir estos dos Metodos
	@Override
	public boolean equals(Object obj){
		boolean iguales = false;
		
		if(this.clave.equals(((Par)obj).clave) && this.valor == (((Par)obj).valor)){
			iguales = true;
		}
		return iguales;
	}
	
	@Override
	public int hashCode(){				//No es necesario si usas el TreeSet
		return clave.hashCode();      //Es indiferente a cual plicarselo a clave o valor.
	}
	
	//Para usar TreeSet
	@Override
	public int compareTo(Par otro){
		
		/*
		//Version nuestra
		int salida = 0;    //Negativo, cero o positivo
		
		if(this.valor > otro.valor){
			salida = 1;
		}
		else  
			if(this.valor < otro.valor){
				salida = -1;
		}
		
		return salida;
		*/
		
		//Version "Pro"
		
		//return this.valor - otro.valor;
		
		//Si fuera por Clave
		
		return this.clave.compareTo(otro.clave);
		
	}
	
	public static void main(String [] args){
		//Crear un objeto Par
		Par p1 = new Par("Granada",18);
		
		//Mostrar por pantalla
		System.out.println("\n" + p1);
		
		//Probar resto de metodos
		p1.setClave("Graná");
		
		System.out.println("\n" + p1.getClave());
	}
}