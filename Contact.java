package contactPackage;

public class Contact {
	
	// declaring variables
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private String phoneNumber;
	
	private String address;
	
	// method to verify id, first name, last name, phone number, and address length
	public Contact(String id, String firstName, String lastName, String phoneNumber, String address) {
		
		// throws exception if id, first name, last name or phone number longer than 10 characters/digits, or if address longer than 30 characters
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.id = id;
		
		this.firstName = firstName;
		
		this.lastName = lastName;
		
		this.phoneNumber = phoneNumber;
		
		this.address = address;
	}
		
		// setters and getters
		public void SetId(String newId) {
			if (newId == null || newId.length() > 10) {
				throw new IllegalArgumentException("Invalid ID");
			}
			this.id = newId;
	}

		public String GetId() {
			return id;
		}
		
		public void SetFirstName(String newFirstName) {
			if (newFirstName == null || newFirstName.length() > 10) {
				throw new IllegalArgumentException("Invalid First Name");
			}
			this.firstName = newFirstName;
	}

		public String GetFirstName() {
			return firstName;
		}
		
		public void SetLastName(String newLastName) {
			if (newLastName == null || newLastName.length() > 10) {
				throw new IllegalArgumentException("Invalid Last Name");
			}
			this.lastName = newLastName;
	}

		public String GetLastName() {
			return lastName;
		}
		
		public void SetPhoneNumber(String newPhoneNumber) {
			if (newPhoneNumber == null || !newPhoneNumber.matches("\\d{10}")) {
				throw new IllegalArgumentException("Invalid Phone Number");
			}
			this.phoneNumber = newPhoneNumber;
	}

		public String GetPhoneNumber() {
			return phoneNumber;
		}
		
		public void SetAddress(String newAddress) {
			if (newAddress == null || newAddress.length() > 30) {
				throw new IllegalArgumentException("Invalid Address");
			}
			this.address = newAddress;
	}

		public String GetAddress() {
			return address;
		}
}
