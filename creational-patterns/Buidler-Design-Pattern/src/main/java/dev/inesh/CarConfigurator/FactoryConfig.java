package dev.inesh.CarConfigurator;

public class FactoryConfig {
    private int limit = 2;
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

    public int getMaxCars() {
        return maxCars;
    }

    public void setMaxCars(int maxCars) {
        this.maxCars = maxCars;
    }
    public void incrementCount() {
        currentCount++;
    }
}
