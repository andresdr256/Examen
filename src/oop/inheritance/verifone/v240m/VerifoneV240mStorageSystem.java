package oop.inheritance.verifone.v240m;

import java.util.Properties;

public class VerifoneV240mStorageSystem {

    private Properties properties = new Properties();

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
