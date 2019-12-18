import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ContactBook {

	private ObjectOutputStream output;
	private ArrayList<Contact> Con = new ArrayList<Contact>();
	
	public void addContact(Contact newcon){
		if(newcon!=null){
			Con.add(newcon);
		}
	}
	public void removeContact(int index){
		if(index<Con.size()){
			Con.remove(index);
		}
	}
	public int size(){
		return Con.size();
	}
	public Contact get(int index){
		if(index<Con.size()){
			return Con.get(index);
		}
		else{
			return null;
		}
	}
}

class Contact implements Serializable{
	
	private String name;
	private String phone;
	private String email;
	
	public Contact(){
		this("","","");
	}
	public Contact(String name,String phone,String email){
		setName(name);
		setPhone(phone);
		setEmail(email);
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getName(){
		return this.name;
	}
	public String getPhone(){
		return this.phone;
	}
	public String getEmail(){
		return this.email;
	}
}