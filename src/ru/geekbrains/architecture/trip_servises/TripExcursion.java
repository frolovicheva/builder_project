package ru.geekbrains.architecture.trip_servises;

public class TripExcursion {
    private final String title;
    private final double priceForExcursion;

    public TripExcursion(String title, double priceForExcursion) {
        this.title = title;
        this.priceForExcursion = priceForExcursion;
    }

    public String getTitle() {
        return title;
    }

    public double getPriceForExcursion() {
        return priceForExcursion;
    }

    @Override
    public String toString() {
        return "TripExcursion{" +
                "title='" + title + '\'' +
                ", priceForExcursion=" + priceForExcursion +
                '}';
    }
}
