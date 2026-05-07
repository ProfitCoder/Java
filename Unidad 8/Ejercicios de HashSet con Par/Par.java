//@ProfitCoder        13:04          06/05/2026

public class Par{
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
	public int hashCode(){
		return clave.hashCode();
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