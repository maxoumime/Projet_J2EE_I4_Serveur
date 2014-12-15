package fr.epsi.firstprojects.controllers.rest;

import fr.epsi.firstprojects.beans.Contact;
import fr.epsi.firstprojects.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mberthea on 02/10/2014.
 */
@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value="/contact", method= RequestMethod.GET)
    public @ResponseBody List<Contact> getContacts(){
        return contactService.getContacts();
    }

    @RequestMapping(value="/contact/{id}", method= RequestMethod.GET)
    public @ResponseBody Contact getContact(@PathVariable("id") String id){
        return contactService.getContact(id);
    }

    @RequestMapping(value="/contact", method= RequestMethod.POST)
    public @ResponseBody boolean addContacts(@RequestBody Contact contact){
        return contactService.addContact(contact);
    }

    @RequestMapping(value="/contact/{id}", method= RequestMethod.PUT)
    public @ResponseBody String updateContacts(@PathVariable("id") String id){
        String contacts = "UPDATE ONE "+id;
        return contacts;
    }

    @RequestMapping(value="/contact/{id}", method= RequestMethod.DELETE)
    public @ResponseBody boolean removeContacts(@PathVariable("id") String id){
        return contactService.deleteContact(contactService.getContact(id));
    }


}
