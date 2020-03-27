package oop.inheritance.verifone.vx690;

import oop.inheritance.tpv.Display;

public class VerifoneVx690Display implements Display {

    private static VerifoneVx690Display verifoneVx690Display;

    private VerifoneVx690Display(){
    }

    /**
     * Prints a message to specied position
     */

    public static VerifoneVx690Display getInstance() {
        if (verifoneVx690Display == null) {
            verifoneVx690Display = new VerifoneVx690Display();
        }

        return verifoneVx690Display;
    }

    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {
    }
}
