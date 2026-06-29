package contactPackage;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

class ContactTest {
	

	@BeforeEach
	public void setUp() {
	}

	@Test
	@Tag("Null Argument")
    void testNullInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, null, null, null, null);
        });
    }
	
	@Test
	@Tag("Set Function")
	void testSetIdInvalid() {
	    Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetId(null);
	    });
	}
	
	@Test
	@Tag("Get Function")
    void testGetIdValid() {
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		Assertions.assertEquals("01", contact.GetId());
    }
	
	@Test
	@Tag("Set Function")
	void testSetIdValid() {
	    Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
	    contact.SetId("02");
	    Assertions.assertEquals("02", contact.GetId());
	}
	
	@Test
	@Tag("Set Function")
	void testSetFirstNameInvalid() {
	    Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetFirstName("JohnJohnJohn");
	    });
	}
	
	@Test
	@Tag("Set Function Valid")
	void testSetFirstNameValid() {
	    Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
	    contact.SetFirstName("Jane");
	    Assertions.assertEquals("Jane", contact.GetFirstName());
	}
	
	@Test
    @Tag("Get Function")
    void testGetFirstNameValid() {
        Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertEquals("John", contact.GetFirstName());
    }
	
	@Test
	@Tag("Set Function")
	void testSetLastNameInvalid() {
	    Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetLastName("DoeDoeDoeDoe");
	    });
	}
	
	@Test
	@Tag("Set Function Valid")
	void testSetLastNameValid() {
	    Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
	    contact.SetLastName("Dor");
	    Assertions.assertEquals("Dor", contact.GetLastName());
	}

	@Test
	@Tag("Get Function")
	void testGetLastNameValid() {
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		Assertions.assertEquals("Doe", contact.GetLastName());
	}
	
	@Test
	@Tag("Set Function")
    void testSetPhoneNumberInvalid() {
        Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetPhoneNumber("12345678900");
	    });
    }
	
	@Test
	@Tag("Set Function Valid")
	void testSetPhoneNumberValid() {
	    Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
	    contact.SetPhoneNumber("1234567891");
	    Assertions.assertEquals("1234567891", contact.GetPhoneNumber());
	}
	
	@Test
	@Tag("Get Function")
    void testGetPhoneNumberValid() {
        Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertEquals("1234567890", contact.GetPhoneNumber());
    }

	@Test
	@Tag("Set Function")
	void testSetdAddressInvalid() {
		Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        contact.SetAddress("12345678901234567890123 Main St");
	    });
	}
	
	@Test
	@Tag("Set Function Valid")
	void testSetAddressValid() {
	    Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
	    contact.SetAddress("124 Main St");
	    Assertions.assertEquals("124 Main St", contact.GetAddress());
	}
	
	@Test
	@Tag("Get Function")
    void testGetAddressValid() {
        Contact contact = new Contact("01", "John", "Doe", "1234567890", "123 Main St");
        Assertions.assertEquals("123 Main St", contact.GetAddress());
    }
}
