package ru.geekbrains.architecture.builder;

import ru.geekbrains.architecture.trip_servises.*;

import java.util.List;

public interface TripBuilder {
void setLocation(TripLocation location);
void setTotalNights (int nights);
void setHotel (TripHotel hotel);
void setMeals(List<Meal> meals);
void setExcursion (TripExcursion excursion);
void setTransfer (TripTransfer transfer);
}
