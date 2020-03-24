package oop.inheritance.data;

public class CardBuilder {
    private String account;
    private ExpirationDate expirationDate;
    private EntryMode entryMode;

    CardBuilder() {
    }

    public CardBuilder account(String account) {
        this.account = account;

        return this;
    }

    public CardBuilder expirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;

        return this;
    }

    public CardBuilder entryMode(EntryMode entryMode) {
        this.entryMode = entryMode;

        return this;
    }

    public Card build() {
        return new Card(account, expirationDate, entryMode);
    }
}

