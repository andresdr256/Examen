package oop.inheritance.ingenico;
import oop.inheritance.tpv.Keyboard;

public class IngenicoKeyboard implements Keyboard {

    private static IngenicoKeyboard ingenicoKeyboard;

    public IngenicoKeyboard(){
    }

    /**
     * @return key pressed
     */

    public static IngenicoKeyboard getInstance() {
        if (ingenicoKeyboard == null) {
            ingenicoKeyboard = new IngenicoKeyboard();
        }

        return ingenicoKeyboard;
    }

    public String get() {
        return "Key pressed";
    }

}
