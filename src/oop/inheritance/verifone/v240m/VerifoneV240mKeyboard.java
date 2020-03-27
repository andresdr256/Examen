package oop.inheritance.verifone.v240m;
import oop.inheritance.tpv.Keyboard;

public class VerifoneV240mKeyboard implements Keyboard {

    private static VerifoneV240mKeyboard verifoneV240mKeyboard;

    public VerifoneV240mKeyboard(){
    }

    /**
     * @return key pressed
     */

    public static VerifoneV240mKeyboard getInstance() {
        if (verifoneV240mKeyboard == null) {
            verifoneV240mKeyboard = new VerifoneV240mKeyboard();
        }

        return verifoneV240mKeyboard;
    }

    public String get() {
        return "Key pressed";
    }

}