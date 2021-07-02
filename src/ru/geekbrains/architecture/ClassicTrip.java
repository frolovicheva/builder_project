package ru.geekbrains.architecture;

import ru.geekbrains.architecture.trip_servises.*;

import java.util.List;

public class ClassicTrip {
    private final TripLocation location;
    private final int totalNights;
    private final TripHotel hotel;
    private final List<Meal> meals;
    private final TripExcursion excursion;
    private final TripTransfer transfer;


    public ClassicTrip(TripLocation location, int nights, TripHotel hotel, List<Meal> meals, TripExcursion excursion, TripTransfer transfer) {
        this.location = location;
        this.totalNights = nights;
        this.hotel = hotel;
        this.meals = meals;
        this.excursion = excursion;
        this.transfer = transfer;
    }

    public TripLocation getLocation() {
        return location;
    }

    public int getTotalNights() {
        return totalNights;
    }

    public TripHotel getHotel() {
        return hotel;
    }

    public List<Meal> getMeal() {
        return meals;
    }

    public TripExcursion getExcursion() {
        return excursion;
    }

    public TripTransfer getTransfer() {
        return transfer;
    }

    @Override
    public String toString() {
        return "ClassicTrip{" +
                "location=" + location +
                ", totalNights=" + totalNights +
                ", hotel=" + hotel +
                ", meal=" + meals +
                ", excursion=" + excursion +
                ", transfer=" + transfer +
                '}';
    }
}
