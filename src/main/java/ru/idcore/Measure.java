package ru.idcore;

public enum Measure {
    MEASURE_KG("кг"),
    MEASURE_L("л"),
    MEASURE_G("100г"),
    MEASURE_THING("шт."),
    MEASURE_10("10шт.");

    public String title;

    Measure(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        String result;

        result = this.title;
        return result;
    }
}
