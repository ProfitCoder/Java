import java.util.Comparator;

public class ComparatorObjetoA implements Comparator<Objeto>{
	//Sobreescribir compare
	@Override
	public int compare(Objeto o1, Objeto o2){
		//negativo, positivo o cero
		return o1.getA() - o2.getA();
	}
}