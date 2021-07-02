package ru.geekbrains.architecture.trip_servises;

public class Meal {
    private final MealType mealType;
    private final double pricePerMeal;

    public Meal(MealType mealType, double pricePerMeal) {
        this.mealType = mealType;
        this.pricePerMeal = pricePerMeal;
    }

    public MealType getMealType() {
        return mealType;
    }

    public double getPricePerMeal() {
        return pricePerMeal;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealType=" + mealType +
                ", pricePerMeal=" + pricePerMeal +
                '}';
    }
}
