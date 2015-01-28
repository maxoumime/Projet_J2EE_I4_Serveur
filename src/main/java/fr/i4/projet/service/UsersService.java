package fr.i4.projet.service;

import java.util.concurrent.ConcurrentLinkedQueue;

import fr.i4.projet.bean.Client;

public class UsersService {

    private static ConcurrentLinkedQueue<Client> allowedUsers = new ConcurrentLinkedQueue<Client>();

    public static boolean isUser(Client client) {

        for (Client allowedUser : allowedUsers) {
          
            if(allowedUser.getLogin().equals(client.getLogin())
                    && allowedUser.getPassword().equals(client.getPassword()))
                return true;
        }

        return false;
    }

    public static boolean isUser(String user, String password) {
        Client client = new Client();
        client.setLogin(user);
        client.setPassword(password);

        return isUser(client);
    }

    public static void addUser(Client user) { allowedUsers.add(user); }
}
