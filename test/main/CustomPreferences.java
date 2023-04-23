package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.prefs.Preferences;
import static java.util.stream.IntStream.builder;
import javax.swing.text.html.parser.Element;
import javax.xml.parsers.FactoryConfigurationError;
import mx.org.software.prefs.Prefs;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author SoftwareOrgMX
 */
public class CustomPreferences {

    public static void main(String[] args) {
//        try {
//            Preferences systemRoot = Preferences.systemRoot();
//            systemRoot.node("aaawdqawd").put("asd", "fcwefwef");
//            Preferences prefs = Prefs.getInstance("mx.google.files");
//            System.out.println("Root: " + prefs.name());
//            Preferences node = prefs.node("asdqwdwefwef");
//            prefs.put("username", "BOB");
//            prefs.put("password", "$#AD#!$$$");
//
//            System.out.println("Reading...Preferences");
//
//            System.out.println(String.format("Username: %s", prefs.get("username", "")));
//            System.out.println(String.format("Password: %s", prefs.get("password", "")));
//            System.out.println(String.format("DefaultValue: %s", prefs.get("noexistKey", "DefaultValue")));
//            prefs.exportNode(new FileOutputStream("A.XML"));
//            node.exportSubtree(new FileOutputStream("B.XML"));
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(CustomPreferences.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException | BackingStoreException | SecurityException ex) {
//            Logger.getLogger(CustomPreferences.class.getName()).log(Level.SEVERE, null, ex);
//        }

   
    }



    private static PlatformLogger logger;
      private static synchronized PlatformLogger logger() {
        if (logger == null) {
            logger = PlatformLogger.getLogger("main");
        }
       
        return logger;
    }
}
