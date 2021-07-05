package ru.geekbrains.architecture.trip_servises;

public class TripHotel {
    private final String hotelName;
    private final double pricePerNight;

    public TripHotel(String hotelName, double pricePerNight) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    @Override
    public String toString() {
        return "TripHotel{" +
                "hotelName='" + hotelName + '\'' +
                ", pricePerNight=" + pricePerNight +
                '}';
    }
}

