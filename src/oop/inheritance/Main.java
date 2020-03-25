package oop.inheritance;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.tpv.AbstractTPVFactory;

public class Main {

    public static void main(String[] args) {
        AbstractTPVFactory factory = AbstractTPVFactory.getFactory(SupportedTerminal.INGENICO);
        Application application = new Application(factory);

        while (true) {
            application.clearScreen();
            application.showMenu();

            String key = application.readKey();

            switch (key) {
                case "1":
                    application.doSale();
                    break;
                case "2":
                    application.doRefund();
                    break;
                case "3":
                    application.printReport();
                    break;
                case "4":
                    application.showConfiguration();
                    break;
            }
        }
    }
}
