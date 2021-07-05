package ru.geekbrains.architecture.trip_servises;

public class TripTransfer {
    private final String transferFrom;
    private final String transferTo;
    private final double priceForTransfer;

    public TripTransfer(String transferFrom, String transferTo, double priceForTransfer) {
        this.transferFrom = transferFrom;
        this.transferTo = transferTo;
        this.priceForTransfer = priceForTransfer;
    }

    public String getTransferFrom() {
        return transferFrom;
    }

    public String getTransferTo() {
        return transferTo;
    }

    public double getPriceForTransfer() {
        return priceForTransfer;
    }

    @Override
    public String toString() {
        return "TripTransfer{" +
                "transferFrom='" + transferFrom + '\'' +
                ", transferTo='" + transferTo + '\'' +
                ", priceForTransfer=" + priceForTransfer +
                '}';
    }
}
