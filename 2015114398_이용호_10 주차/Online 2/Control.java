import java.io.Serializable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.ObjectOutputStream;

public class Control{
	
	private static ObjectOutputStream output;
	private static ObjectInputStream input;
	static ContactBook contactbook = new ContactBook();
	
	public static void main(String[] args){
		
		openinFile();
		readRecords();
		closeinFile();
		int menu=0;
		int index=0,i=0;
		String tempname;
		String tempphone;
		String tempemail;
		
		Scanner input=new Scanner(System.in);
		Contact temp;
		
		
		while(true){
			System.out.printf("1. add Contact / 2. remove Contact / 3. print all / 4.save & exit\n");
			menu=input.nextInt();
			switch(menu){
			case 1 :
				System.out.printf("name? : ");
				tempname=input.nextLine();
				tempname=input.nextLine();
				
				System.out.printf("phoneNumber? : ");
				tempphone=input.nextLine();
				
				System.out.printf("email? : ");
				tempemail=input.nextLine();
				
				contactbook.addContact(temp=new Contact(tempname,tempphone,tempemail));
				break;
			case 2 :
				System.out.printf("index? : ");
				index=input.nextInt();
				if(index<0||index>=contactbook.size()){
					System.out.printf("index out of range\n");
				}
				else{
					contactbook.removeContact(index);
					System.out.printf("contact at %d was removed\n",index);
				}
				break;
			case 3 :
				System.out.printf("--------------------\n");
				for(i=0;i<contactbook.size();i++){
					System.out.printf("name : %s\n",contactbook.get(i).getName());
					System.out.printf("phoneNumber : %s\n",contactbook.get(i).getPhone());
					System.out.printf("email : %s\n",contactbook.get(i).getEmail());
					System.out.printf("--------------------\n");
				}
				break;
			case 4 : 
				openoutFile();
				addRecords();
				closeoutFile();
				System.exit(1);
				break;
			default : 
				System.out.printf("잘못된 번호\n");
			}
		}
	}
	static public void openoutFile(){
		
		try{
			output=new ObjectOutputStream(new FileOutputStream("output.ser"));
		}
		catch(IOException ioException){
			System.err.println("Error opening file.");
		}
	}
	static public void openinFile(){
		
		try{
			input=new ObjectInputStream(new FileInputStream("output.ser"));
		}
		catch(IOException ioException){
			System.err.println("Error opening file.");
		}
	}
	static public void addRecords(){
		
		ContactBook record;
		
		record=contactbook;
		try{
			output.writeObject(record);
		}
		catch(IOException ioException){
			
		}
		catch(NoSuchElementException elementException){
			
		}
	}
	static void closeoutFile(){
		try{
			output.close();
		}
		catch(IOException ioException){
			
		}
	}
	static void closeinFile(){
		try{
			input.close();
		}
		catch(IOException ioException){
			
		}
	}
	static void readRecords(){
		
		ContactBook record = new ContactBook();
		
		if(input!=null){
			try{
				record=(ContactBook) input.readObject();
			}
			catch(EOFException endOfFileException){
			
			}
			catch(ClassNotFoundException classNotFoundException){
				
			}
			catch(IOException ioException){
			
			}
		contactbook=record;
		}
	}
}

class ContactBook implements Serializable{

	private ObjectOutputStream output;
	ArrayList<Contact> Con = new ArrayList<Contact>();
	
	public void addContact(Contact newcon){
		Con.add(newcon);
	}
	public void removeContact(int index){
		Con.remove(index);
	}
	public int size(){
		return Con.size();
	}
	public Contact get(int index){
		return Con.get(index);
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