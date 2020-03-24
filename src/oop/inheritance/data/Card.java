package oop.inheritance.data;

public final class Card {
    private final String account;
    private final ExpirationDate expirationDate;
    private final EntryMode entryMode;

    public Card(String account, ExpirationDate expirationDate, EntryMode entryMode) {
        this.account = account;
        this.expirationDate = expirationDate;
        this.entryMode = entryMode;
    }

    public String getAccount() {
        return account;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }


    public EntryMode getEntryMode() {
        return entryMode;
    }

    public static CardBuilder builder() {
        return new CardBuilder();
    }
}
