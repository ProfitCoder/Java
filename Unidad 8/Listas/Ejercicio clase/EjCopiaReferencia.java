import java.util.LinkedList;

public class EjCopiaReferencia{
	public static void main(String [] args){
		System.out.pritln("Paso por valor/copia - Inmutables");
		LinkedList <String> listaString = new LinkedList<>();
		
		String nombre1 = "Ana";
		String nombre2 = "Paco";
		
		listaString.add(nombre1);
		listaString.add(nombre2);
		
		System.out.pritnln("****** Antes de modificar ******");
		System.out.println(listaString);
		
		nombre1 = "Ana Maria";
		
		System.out.println("*** Después de modificar ***");
		System.out.println(listaString);
		
		
		System.out.println("\nPaso por referencia - Mutables");
		LinkedList <Contacto> listaContacto = new LinkedList<>();
		
		
		
	}
}