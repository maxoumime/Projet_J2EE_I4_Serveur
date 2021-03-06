package fr.i4.projet.service;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by maxoumime on 28/01/15.
 */
public class TokenCheck {

    private static HashMap<String, String> tokens = new HashMap<String, String>();

    public static boolean checkToken(String token){

        return tokens.containsValue(token);
    }

    public static String addToken(String user, String password){

        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        tokens.put(user+":"+password, randomUUIDString);
        return randomUUIDString;
    }
}
