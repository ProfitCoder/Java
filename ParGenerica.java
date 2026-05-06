//@ProfitCoder      13:15    06/05/2026

public class ParGenerica<T,V>{				//Se usan T y V para señalar que se van a coger dos valores genericos, T y otra letra que se quiera para diferenciar los demás
		//Atributos
		private final T CLAVE;
		private final V VALOR;
		
		//Constructores
		public ParGenerica(T clave,V valor){
			this.CLAVE = clave;
			this.VALOR = valor;
		}
		
		//Metodos
		public T getClave(){
			return CLAVE;
		}
		
		public V getValor(){
			return VALOR;
		}
		
		@Override
		public String toString(){
			return String.format("{%s,%s}",CLAVE,VALOR);
		}
		
		public static void main(String[] args){
			//Ejemplo prueba
			ParGenerica <String,Integer> par1 = new ParGenerica<>("Jaen",23);
			System.out.println(par1);
			System.out.println("Clave: " + par1.getClave());
			System.out.println("Valor: " + par1.getValor());
			
			ParGenerica <String,Integer> par2 = new ParGenerica<>('f',9.5);
			System.out.println(par2);
			System.out.println("Clave: " + par2.getClave());
			System.out.println("Valor: " + par2.getValor());
		}
}