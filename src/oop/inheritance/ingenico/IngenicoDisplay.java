package oop.inheritance.ingenico;

public class IngenicoDisplay {

    private static IngenicoDisplay ingenicoDisplay;

    private IngenicoDisplay(){
    }

    /**
     * Prints a message to specied position
     */

    public static IngenicoDisplay getInstance() {
        if (ingenicoDisplay == null) {
            ingenicoDisplay = new IngenicoDisplay();
        }

        return ingenicoDisplay;
    }

    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {
    }
}
