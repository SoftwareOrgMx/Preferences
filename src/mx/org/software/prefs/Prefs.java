package mx.org.software.prefs;

import java.util.prefs.Preferences;

public class Prefs {

    private static String KEY_DEFAULT = "mx.org.software.prefs";

    private Preferences state;

    private Prefs() {
    }

    public void setRoot() {
        state = Preferences.userRoot().node(KEY_DEFAULT);
    }

    public Preferences getState() {
        setRoot();
        return state;
    }

    public static Preferences getInstance() {
        return Prefs2Holder.INSTANCE.getState();
    }

    public static Preferences getInstance(String value) {
        KEY_DEFAULT = value;
        return Prefs2Holder.INSTANCE.getState();
    }

    private static class Prefs2Holder {
        private static final Prefs INSTANCE = new Prefs();
    }
}
