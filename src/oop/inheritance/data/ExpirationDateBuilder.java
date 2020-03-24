package oop.inheritance.data;

public class ExpirationDateBuilder {
    private int year;
    private int month;

    ExpirationDateBuilder() {
    }

    public ExpirationDateBuilder year(int year) {
        this.year = year;

        return this;
    }

    public ExpirationDateBuilder month(int month) {
        this.month = month;

        return this;
    }

    public ExpirationDate build() {
        return new ExpirationDate(year, month);
    }

}
