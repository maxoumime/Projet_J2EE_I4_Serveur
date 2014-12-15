package fr.epsi.firstprojects.soap;

import fr.epsi.firstprojects.beans.Contact;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by maxoumime on 15/12/14.
 */

@WebService(name="ContactService", serviceName = "ContactService")
public interface ContactService {

    public Contact getContact(@WebParam(name="id") String id);
}
