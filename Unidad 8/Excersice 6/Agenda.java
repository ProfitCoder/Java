//ProfitCoder      9:23      11/05/2026

import java.util.TreeSet;

public class Agenda{
	//Atributes
	private TreeSet<Contact> agenda;
	
	//Constructor
	public Agenda(){
		agenda = new TreeSet<>();
	}
	
	//If we use a1.""(); instad of a1.agenda.add(); we need to Override this method
	public boolean saveContact(Contact s){
		return agenda.add(s);
	}
	
	public static void main(String [] args){
		Agenda a1 = new Agenda();
		
		//Creation of 3 Contacts
		Contact c1 = new Contact("Pablo","999999999","Example1@gmail.com");
		Contact c2 = new Contact("Ana","999999998","Example2@gmail.com");
		Contact c3 = new Contact("Jose","999999997","Example3@gmail.com");
		Contact c4 = new Contact("Jose","1111111111","Example4@gmail.com"); //This one is not going to appear.
		
		//Save those conacts on the Agenda.
		//a1.agenda.add(c1);     rigth form
		a1.saveContact(c1);
		a1.saveContact(c2);
		a1.saveContact(c3);
		a1.saveContact(c4);
		
		//Espacio
		System.out.println();
		
		//Show it with a for-each
		for(Contact c : a1.agenda){
			System.out.println(c);
		}
		
	}
}