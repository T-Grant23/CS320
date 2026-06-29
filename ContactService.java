package contactPackage;

import java.util.ArrayList;

public class ContactService {
	
	// new contact list
	ArrayList<Contact> list = new ArrayList<Contact>();
	// method to add contact to list
	public boolean addContact(Contact contact) {
		
		boolean didAdd = false;
		
		// checks if list is empty, adds contact if so
		if (list.size() == 0) {
			list.add(contact);
			didAdd = true;
		}
		else { // if contact ID being added matches another ID returns false
			for (Contact c : list) {
				if (contact.GetId().equalsIgnoreCase(c.GetId())) {
					return didAdd;
				}
			}
			list.add(contact);
			didAdd = true;
		}
		
		return didAdd;
	}
	
	// method to delete contact per contact ID
	public boolean deleteContact(String id) {
		
		boolean didDelete = false;
		// if ID in list matches deletes contact
		for (Contact c : list) {
			if (id.equalsIgnoreCase(c.GetId())) {
				list.remove(c);
				didDelete = true;
				break;
			}
		}
		
		return didDelete;
		
	}
	
	public boolean updateContactFirstName(String id, String firstName) {
		
		boolean didUpdate = false;
		// check for correct ID
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		// check for correct first name
		if (firstName == null || firstName.length() > 10) {
	        throw new IllegalArgumentException("Invalid First Name");
	    }
		// if ID in list matches update first name
		for (Contact c : list) {
			if (id.equalsIgnoreCase(c.GetId())) {
				c.SetFirstName(firstName);
				didUpdate = true;
			}
		}
		return didUpdate;
	}
	
	public boolean updateContactLastName(String id, String lastName) {
		
		boolean didUpdate = false;
		
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		if (lastName == null || lastName.length() > 10) {
	        throw new IllegalArgumentException("Invalid Last Name");
	    }
		
		for (Contact c : list) {
			if (id.equalsIgnoreCase(c.GetId())) {
				c.SetLastName(lastName);
				didUpdate = true;
			}
		}
		return didUpdate;
	}
	
	public boolean updateContactPhoneNumber(String id, String phoneNumber) {
		
		boolean didUpdate = false;
		
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
	        throw new IllegalArgumentException("Invalid Phone Number");
	    }
		
		for (Contact c : list) {
			if (id.equalsIgnoreCase(c.GetId())) {
				c.SetPhoneNumber(phoneNumber);
				didUpdate = true;
			}
		}
		return didUpdate;
	}
	
	public boolean updateContactAddress(String id, String address) {
		
		boolean didUpdate = false;
		
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		if (address == null || address.length() > 30) {
	        throw new IllegalArgumentException("Invalid Address");
	    }
		
		for (Contact c : list) {
			if (id.equalsIgnoreCase(c.GetId())) {
				c.SetAddress(address);
				didUpdate = true;
			}
		}
		return didUpdate;
	}	
	
}
