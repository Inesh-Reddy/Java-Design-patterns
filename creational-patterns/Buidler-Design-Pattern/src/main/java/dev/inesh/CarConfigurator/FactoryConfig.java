package dev.inesh.CarConfigurator;
//Challenge 2: Intermediate - Car Configurator with Director
//Scenario: A car manufacturer builds Car objects with required engine and optional color, sunroof, etc.
//Tie-in: Use Singleton for a FactoryConfig (e.g., max production limit).
//Steps:
//Create a Singleton FactoryConfig with a maxCars limit and current count.
//Define Car with required engine and optional fields.
//Build a CarBuilder with fluent methods for optional parts.
//Add a Director class with a buildSportsCar() method for a preset configuration.
//Check FactoryConfig Singleton in build()—reject if limit exceeded.

//Test: Build a custom car and a sports car, ensure limit works.

//Checkpoints:
//Singleton FactoryConfig tracks car count correctly.
//CarBuilder constructs a valid custom Car.
//Director produces a preset Car with specific options.
//Building beyond maxCars fails (e.g., throw exception).
//Output shows both cars’ details.


public class FactoryConfig {
    private int limit = 1;
    private int currentCount = 0;
    private int maxCars = 1;
    private static FactoryConfig instance;

    FactoryConfig() {

    }

    public static FactoryConfig getInstance() {
        if (instance == null) {
            instance = new FactoryConfig();
        }
        return instance;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

//    public int getLimit() {
//        return limit;
//    }
//
//    public void setLimit(int limit) {
//        this.limit = limit;
//    }

    public int getMaxCars() {
        return maxCars;
    }

    public void setMaxCar(int maxCars) {
        this.maxCars = maxCars;
    }
    public void incrementCount() {
        currentCount++;
    }
}
