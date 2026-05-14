//ProfitCoder      9:23      11/05/2026

public class Contact implements Comparable<Contact>{
	//Atributes
	private String name;
	private String phone;
	private String email;
	
	//Constructor
	public Contact(String name, String phone, String email){
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	//Methods
	@Override
	public String toString(){
		return String.format("{Name: %s,Phone: %s,Email: %s}",name,phone,email);
	}
	
	@Override											//We do it like that becasue, String already has the necesary methods
	public int compareTo(Contact obj){
		return this.name.compareTo(obj.name);
	}
}