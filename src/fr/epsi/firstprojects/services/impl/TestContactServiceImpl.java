package fr.epsi.firstprojects.services.impl;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;

import fr.epsi.firstprojects.beans.Contact;
import fr.epsi.firstprojects.services.ContactService;

public class TestContactServiceImpl {

	@Test
	public void getContacts() {
		ContactService service = new ContactServiceImpl();
		List<Contact> contacts = service.getContacts();
		
		if (contacts == null || contacts.size() == 0) {
			fail("Contacts could not be found");
		}
	}

	@Test
	public void addContact() {
		ContactService service = new ContactServiceImpl();
		Contact contact = new Contact();
		contact.setLogin("test");
		contact.setName("user test");
		contact.setPassword("pass");

		if (!service.addContact(contact)) {
			fail("Contact could not be null after add");
		}
	}

	@Test
	public void updateContact() {
		ContactService service = new ContactServiceImpl();
		Contact contact = new Contact();
		contact.setLogin("test");
		contact.setName("user test");
		contact.setPassword("password");
		
		if (!service.updateContact(contact)) {
			fail("Contact could not be null after update");
		}
	}

	@Test
	public void deleteContact() {
		ContactService service = new ContactServiceImpl();
		Contact contact = new Contact();
		contact.setLogin("test");
		
		if (!service.deleteContact(contact)) {
			fail("Contact could not be null after delete");
		}
	}
	
	@Test
	public void getContact() {
		ContactService service = new ContactServiceImpl();
		
		if (service.getContact("1") == null) {
			fail("Contact could not be found");
		}
	}

}
