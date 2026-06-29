package contactPackage;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import java.time.Duration;

class ContactServiceTest {

	@BeforeEach
	void setUp() {
	}

	@Test
	@Tag("Add Function")
	void testAddContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		Assertions.assertTrue(service.addContact(contact));
	}
	
	@Test
	@Tag("Add Function")
	void testAddMultipleContacts() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		Contact contact1 = new Contact("02", "Jane", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		Assertions.assertTrue(service.addContact(contact1));
	}
	
	@Test
	@Tag("Add Function Duplicate ID")
	void testAddSameIdContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		Contact contact1 = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		Assertions.assertFalse(service.addContact(contact1));
	}
	
	@Test
	@Tag("Add Function Timing")
	void testAddContactTime() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		Assertions.assertTimeout(Duration.ofMillis(100), () -> {
			service.addContact(contact);
		});
	}
	
	@Test
	@Tag("Delete Function")
	void testDeleteContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		Assertions.assertTrue(service.deleteContact("01"));
	}
	
	@Test
	@Tag("Update Function")
	void testUpdateContactFirstName() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		Assertions.assertTrue(service.updateContactFirstName("01", "Jane"));
	}
	
	@Test
	@Tag("Update Function")
	void testUpdateContactFirstNameInvalid() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactFirstName("01", "JohnJohnJohn");
	    });
	}
	
	@Test
	@Tag("Update Function")
	void testUpdateContactLastName() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		Assertions.assertTrue(service.updateContactLastName("01", "Don"));
	}
	
	@Test
	@Tag("Update Function")
	void testUpdateContactLastNameInvalid() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactLastName("01", "DoeDoeDoeDoe");
	    });
	}
	
	@Test
	@Tag("Update Function")
	void testUpdateContactPhoneNumber() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		Assertions.assertTrue(service.updateContactPhoneNumber("01", "1234567899"));
	}
	
	@Test
	@Tag("Update Function")
	void testUpdateContactPhoneNumberInvalid() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactPhoneNumber("01", "12345");
	    });
	}
	
	@Test
	@Tag("Update Function")
	void testUpdateContactAddress() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		Assertions.assertTrue(service.updateContactAddress("01", "124 Main St"));
	}

	@Test
	@Tag("Update Function")
	void testUpdateContactAddressInvalid() {
		ContactService service = new ContactService();
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		service.addContact(contact);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			service.updateContactAddress("01", "12345678901234567890123 Main St");
	    });
	}
	
}
