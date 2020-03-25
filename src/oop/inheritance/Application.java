package oop.inheritance;

import oop.inheritance.data.*;
import oop.inheritance.ingenico.*;
import oop.inheritance.verifone.v240m.VerifoneV240mDisplay;

import java.time.LocalDateTime;

public class Application {

    private CommunicationType communicationType = CommunicationType.ETHERNET;
    private SupportedTerminal supportedTerminal;

    public Application(SupportedTerminal supportedTerminal) {
        this.supportedTerminal = supportedTerminal;
    }

    public void showMenu() {
        if (supportedTerminal == SupportedTerminal.INGENICO) {
            IngenicoDisplay ingenicoDisplay = IngenicoDisplay.getInstance();

            ingenicoDisplay.showMessage(5, 5, "MENU");
            ingenicoDisplay.showMessage(5, 10, "1. VENTA");
            ingenicoDisplay.showMessage(5, 13, "2. DEVOLUCION");
            ingenicoDisplay.showMessage(5, 16, "3. REPORTE");
            ingenicoDisplay.showMessage(5, 23, "4. CONFIGURACION");
        } else {
            VerifoneV240mDisplay verifoneV240mDisplay = new VerifoneV240mDisplay();

            verifoneV240mDisplay.showMessage(5, 5, "MENU");
            verifoneV240mDisplay.showMessage(5, 10, "1. VENTA");
            verifoneV240mDisplay.showMessage(5, 13, "2. DEVOLUCION");
            verifoneV240mDisplay.showMessage(5, 16, "3. REPORTE");
            verifoneV240mDisplay.showMessage(5, 23, "4. CONFIGURACION");
        }

    }

    public String readKey() {
        IngenicoKeyboard ingenicoKeyboard = IngenicoKeyboard.getInstance();

        return ingenicoKeyboard.get();
    }

    public void doSale() {
        IngenicoCardSwipper cardSwipper = new IngenicoCardSwipper();
        IngenicoChipReader chipReader = new IngenicoChipReader();
        IngenicoDisplay ingenicoDisplay = IngenicoDisplay.getInstance();
        IngenicoKeyboard ingenicoKeyboard = IngenicoKeyboard.getInstance();
        Card card;

        do {
            card = cardSwipper.readCard();
            if (card == null) {
                card = chipReader.readCard();
            }
        } while (card == null);

        ingenicoDisplay.clear();
        ingenicoDisplay.showMessage(5, 20, "Capture monto:");

        String amount = ingenicoKeyboard.get(); //Amount with decimal point as string

        Transaction transaction = Transaction.builder()
                .localDateTime(LocalDateTime.now())
                .card(card)
                .amountInCents(Integer.parseInt(amount.replace(".", "")))
                .build();

        TransactionResponse response = sendSale(transaction);

        if (response.isApproved()) {
            ingenicoDisplay.showMessage(5, 25, "APROBADA");
            printReceipt(transaction, response.getHostReference());
        } else {
            ingenicoDisplay.showMessage(5, 25, "DENEGADA");
        }
    }

    private void printReceipt(Transaction transaction, String hostReference) {
        IngenicoPrinter ingenicoPrinter = new IngenicoPrinter();
        Card card = transaction.getCard();

        ingenicoPrinter.print(5, "APROBADA");
        ingenicoPrinter.lineFeed();
        ingenicoPrinter.print(5, card.getAccount());
        ingenicoPrinter.lineFeed();
        ingenicoPrinter.print(5, "" + transaction.getAmountInCents());
        ingenicoPrinter.lineFeed();
        ingenicoPrinter.print(5, "________________");

    }

    private TransactionResponse sendSale(Transaction transaction) {
        IngenicoEthernet ethernet = IngenicoEthernet.getInstance();
        IngenicoModem modem = IngenicoModem.getInstance();
        IngenicoGPS gps = IngenicoGPS.getInstance();
        TransactionResponse transactionResponse = null;

        switch (communicationType) {
            case ETHERNET:
                ethernet.open();
                ethernet.send(transaction);
                transactionResponse = ethernet.receive();
                ethernet.close();
                break;
            case GPS:
                gps.open();
                gps.send(transaction);
                transactionResponse = gps.receive();
                gps.close();
                break;
            case MODEM:
                modem.open();
                modem.send(transaction);
                transactionResponse = modem.receive();
                modem.close();
                break;
        }

        return transactionResponse;
    }

    public void doRefund() {
    }

    public void printReport() {
    }

    public void showConfiguration() {
    }

    public void clearScreen() {
        if (supportedTerminal == SupportedTerminal.INGENICO) {
            IngenicoDisplay ingenicoDisplay = IngenicoDisplay.getInstance();

            ingenicoDisplay.clear();
        } else {
            VerifoneV240mDisplay verifoneV240mDisplay = new VerifoneV240mDisplay();

            verifoneV240mDisplay.clear();
        }
    }
}
