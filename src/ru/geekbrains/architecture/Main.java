package ru.geekbrains.architecture;

import ru.geekbrains.architecture.builder.ClassicTripBuilder;
import ru.geekbrains.architecture.trip_servises.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ClassicTripBuilder tripToKarelia = new ClassicTripBuilder ();
        tripToKarelia.setLocation (TripLocation.KARELIA);
        tripToKarelia.setHotel (new TripHotel ("Paradise", 1500.00));
        List<Meal> mealsInKarelia = new ArrayList<> ();
        mealsInKarelia.add (new Meal (MealType.BREAKFAST, 300.00));
        tripToKarelia.setMeals (mealsInKarelia);
        tripToKarelia.setTotalNights (12);
        ClassicTrip classicTrip1 = tripToKarelia.getTrip ();
        System.out.println (classicTrip1.toString ());

        ClassicTripBuilder tripToAltai = new ClassicTripBuilder ();
        tripToAltai.setLocation (TripLocation.ALTAI);
        tripToAltai.setTotalNights (10);
        List<Meal> mealsInAltai = new ArrayList<> ();
        mealsInAltai.add (new Meal (MealType.BREAKFAST,200.00));
        mealsInAltai.add (new Meal (MealType.SUPPER,500.00));
        tripToAltai.setMeals (mealsInAltai);
        tripToAltai.setTransfer (new TripTransfer ("airportA", "camp_site", 1000.00));
        ClassicTrip classicTrip2 = tripToAltai.getTrip ();
        System.out.println (classicTrip2.toString ());
    }
}
