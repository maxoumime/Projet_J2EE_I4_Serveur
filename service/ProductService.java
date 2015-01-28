package fr.i4.projet.service;

import java.util.List;

import fr.epsi.firstprojects.beans.Contact;

public interface ProductService {

	public List<Contact> getContacts();
	public Contact getContact(String id);
	public boolean addContact(Contact contact);
	public boolean updateContact(Contact contact);
	public boolean deleteContact(Contact contact);
}
