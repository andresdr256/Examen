package oop.inheritance.ingenico;

public class IngenicoKeyboard {

    private static IngenicoKeyboard ingenicoKeyboard;

    private IngenicoKeyboard(){
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
