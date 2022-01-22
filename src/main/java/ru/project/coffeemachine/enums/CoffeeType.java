package ru.project.coffeemachine.enums;

public enum CoffeeType {

    AMERICANO ("1"),
    ESPRESSO ("2"),
    DOUBLE_ESPRESSO ("3"),
    LUNGO ("4"),
    DOUBLE_LUNGO ("5"),
    LATTE ("6"),
    FRAPPE ("7"),
    KAPUCHINO ("8"),
    TEA ("9"),
    WATER ("0");

    private final String title;

    CoffeeType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "CoffeeType{" +
                "title='" + title + '\'' +
                '}';
    }
}
