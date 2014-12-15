package fr.epsi.firstprojects.services;

import fr.epsi.firstprojects.beans.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ContactService {

	public List<Contact> getContacts();
	public Contact getContact(String id);
	public boolean addContact(Contact contact);
	public boolean updateContact(Contact contact);
	public boolean deleteContact(Contact contact);
}
