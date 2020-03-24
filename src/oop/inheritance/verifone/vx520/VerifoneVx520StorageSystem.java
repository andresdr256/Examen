package oop.inheritance.verifone.vx520;

import java.util.Properties;

public class VerifoneVx520StorageSystem {

    private Properties properties = new Properties();

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
