import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContactBookTest {
	ContactBook contactBook;
	
	@Before
	public void setUp(){
		contactBook = new ContactBook();
	}
	@Test
	public void getTest(){
		contactBook.addContact(new Contact("Kim","010-1111-2222","java@oracle.com"));
		contactBook.addContact(new Contact("Sue","010-3333-4444","csharp@microsoft.com"));
		
		Contact contactAt0 = contactBook.get(0);
		assertEquals("Kim",contactAt0.getName());
		assertEquals("010-1111-2222",contactAt0.getPhone());
		assertEquals("java@oracle.com",contactAt0.getEmail());
		
		Contact contactAt1 = contactBook.get(1);
		assertEquals("Sue",contactAt1.getName());
		assertEquals("010-3333-4444",contactAt1.getPhone());
		assertEquals("csharp@microsoft.com",contactAt1.getEmail());

		Contact contactAt2 = contactBook.get(2);
		assertEquals(null,contactAt2);
	}
	@Test
	public void addContactTest() {
		contactBook.addContact(null);
		assertEquals(0,contactBook.size());
		contactBook.addContact(new Contact("Kim","010-1111-2222","java@oracle.com"));
		assertEquals(1,contactBook.size());
		contactBook.addContact(new Contact("Sue","010-3333-4444","csharp@microsoft.com"));
		assertEquals(2,contactBook.size());
		contactBook.addContact(new Contact("Bak","010-5555-6666","swift@apple.com"));
		assertEquals(3,contactBook.size());
		contactBook.addContact(null);
		assertEquals(3,contactBook.size());
		
		Contact contactAt0 = contactBook.get(0);
		assertEquals("Kim",contactAt0.getName());
		assertEquals("010-1111-2222",contactAt0.getPhone());
		assertEquals("java@oracle.com",contactAt0.getEmail());
		
		Contact contactAt1 = contactBook.get(1);
		assertEquals("Sue",contactAt1.getName());
		assertEquals("010-3333-4444",contactAt1.getPhone());
		assertEquals("csharp@microsoft.com",contactAt1.getEmail());
		
		Contact contactAt2 = contactBook.get(2);
		assertEquals("Bak",contactAt2.getName());
		assertEquals("010-5555-6666",contactAt2.getPhone());
		assertEquals("swift@apple.com",contactAt2.getEmail());
	}
	@Test
	public void removeContactTest(){
		contactBook.addContact(new Contact("Kim","010-1111-2222","java@oracle.com"));
		contactBook.addContact(new Contact("Sue","010-3333-4444","csharp@microsoft.com"));
		contactBook.addContact(new Contact("Bak","010-5555-6666","swift@apple.com"));
		assertEquals(3,contactBook.size());
		
		contactBook.removeContact(0);
		assertEquals(2,contactBook.size());
		
		Contact contactAt0 = contactBook.get(0);
		assertEquals("Sue",contactAt0.getName());
		assertEquals("010-3333-4444",contactAt0.getPhone());
		assertEquals("csharp@microsoft.com",contactAt0.getEmail());
		
		contactBook.removeContact(2);
		assertEquals(2,contactBook.size());
		
		contactBook.removeContact(1);
		assertEquals(1,contactBook.size());
		
		contactAt0 = contactBook.get(0);
		assertEquals("Sue",contactAt0.getName());
		assertEquals("010-3333-4444",contactAt0.getPhone());
		assertEquals("csharp@microsoft.com",contactAt0.getEmail());
	}

}
