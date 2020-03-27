package oop.inheritance.verifone.v240m;
import oop.inheritance.tpv.Display;

public class VerifoneV240mDisplay implements Display {

    private static VerifoneV240mDisplay verifoneV240mDisplay;

    private VerifoneV240mDisplay(){
    }

    /**
     * Prints a message to specied position
     */

    public static VerifoneV240mDisplay getInstance() {
        if (verifoneV240mDisplay == null) {
            verifoneV240mDisplay = new VerifoneV240mDisplay();
        }

        return verifoneV240mDisplay;
    }

    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {
    }
}
