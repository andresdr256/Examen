package oop.inheritance.data;

import java.time.LocalDateTime;

public class Transaction {
    private int amountInCents;
    private Card card;
    private LocalDateTime localDateTime;

    public Transaction(int amountInCents, Card card, LocalDateTime localDateTime) {
        this.amountInCents = amountInCents;
        this.card = card;
        this.localDateTime = localDateTime;
    }

    public int getAmountInCents() {
        return amountInCents;
    }


    public Card getCard() {
        return card;
    }


    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }



    public static TransactionBuilder builder() {
        return new TransactionBuilder();
    }
}