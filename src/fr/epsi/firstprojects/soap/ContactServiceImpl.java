package fr.epsi.firstprojects.soap;

import fr.epsi.firstprojects.beans.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * Created by maxoumime on 15/12/14.
 */
public class ContactServiceImpl extends SpringBeanAutowiringSupport implements ContactService {

    @Autowired
    private fr.epsi.firstprojects.services.ContactService contactService;

    @Override
    public Contact getContact(String id){
        return contactService.getContact(id);
    }
}
