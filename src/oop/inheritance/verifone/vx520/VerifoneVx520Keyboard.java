package oop.inheritance.verifone.vx520;
import oop.inheritance.tpv.Keyboard;

public class VerifoneVx520Keyboard implements Keyboard {

    private static VerifoneVx520Keyboard verifoneVx520Keyboard;

    public VerifoneVx520Keyboard(){
    }

    /**
     * @return key pressed
     */

    public static VerifoneVx520Keyboard getInstance() {
        if (verifoneVx520Keyboard == null) {
            verifoneVx520Keyboard = new VerifoneVx520Keyboard();
        }

        return verifoneVx520Keyboard;
    }

    public String get() {
        return "Key pressed";
    }

}
