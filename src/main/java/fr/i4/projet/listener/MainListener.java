package fr.i4.projet.listener;

import fr.i4.projet.bean.Client;
import fr.i4.projet.service.UsersService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MainListener implements ServletContextListener {

    public MainListener() {


    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Client john = new Client("John Doe", "john", "doe");
        UsersService.addUser(john);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
