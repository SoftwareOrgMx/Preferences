/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import mx.org.software.prefs.Prefs;

/**
 *
 * @author Andres
 */
public class DefaultPreferences {

    public static void main(String[] args) {
        try {
            Preferences prefs = Prefs.getInstance();//mx.org.software.prefs
            System.out.println("Root: " + prefs.name());
            
            prefs.put("username", "BOB");
            prefs.put("password", "$#AD#!$$$");
            
            System.out.println("Reading...Preferences");
            
            System.out.println(String.format("Username: %s", prefs.get("username", "")));
            System.out.println(String.format("Password: %s", prefs.get("password", "")));
            System.out.println(String.format("DefaultValue: %s", prefs.get("noexistKey", "DefaultValue")));
            
            prefs.exportNode(new FileOutputStream("a.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DefaultPreferences.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DefaultPreferences.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BackingStoreException ex) {
            Logger.getLogger(DefaultPreferences.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
