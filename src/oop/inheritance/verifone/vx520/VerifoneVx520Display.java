package oop.inheritance.verifone.vx520;

import oop.inheritance.tpv.Display;

public class VerifoneVx520Display implements Display {

    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    private static VerifoneVx520Display verifoneVx520Display;

    private VerifoneVx520Display(){
    }

    /**
     * Prints a message to specied position
     */

    public static VerifoneVx520Display getInstance() {
        if (verifoneVx520Display == null) {
            verifoneVx520Display = new VerifoneVx520Display();
        }

        return verifoneVx520Display;
    }

    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {
    }
}
