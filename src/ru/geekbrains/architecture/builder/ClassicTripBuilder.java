package ru.geekbrains.architecture.builder;

import ru.geekbrains.architecture.ClassicTrip;
import ru.geekbrains.architecture.trip_servises.*;

import java.util.List;

public class ClassicTripBuilder implements TripBuilder {

    private TripLocation location;
    private int totalNights;
    private TripHotel hotel;
    private List<Meal> meals;
    private TripExcursion excursion;
    private TripTransfer transfer;

    @Override
    public void setLocation(TripLocation location) {
        this.location = location;
    }

    @Override
    public void setTotalNights(int nights) {
        this.totalNights = nights;
    }

    @Override
    public void setHotel(TripHotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public void setMeals(List<Meal> meals) {
        this.meals = meals;

    }

    @Override
    public void setExcursion(TripExcursion excursion) {
        this.excursion = excursion;

    }

    @Override
    public void setTransfer(TripTransfer transfer) {
        this.transfer = transfer;

    }

    public ClassicTrip getTrip(){
        return new ClassicTrip (location, totalNights, hotel, meals, excursion, transfer);
    }

}
