package fr.i4.projet.service;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by maxoumime on 28/01/15.
 */
public class UsersService {

    private static ConcurrentLinkedQueue<String> allowedUsers = new ConcurrentLinkedQueue<String>();

    public static boolean isUser(String user, String password) { return isUser(user + ":" + password); }
    public static boolean isUser(String userpassword) { return allowedUsers.contains(userpassword); }
    public static void addUser(String user, String password) { allowedUsers.add(user+":"+password);}
}
