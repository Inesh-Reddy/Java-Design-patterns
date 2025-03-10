package dev.inesh.CarConfigurator;

public class Car {
    private final String engine;  // Immutable
    private final String color;
    private final String sunroof;

    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
    }

    public String getEngine() { return engine; }
    public String getColor() { return color; }
    public String getSunroof() { return sunroof; }

    @Override
    public String toString() {
        return "Car{engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", sunroof='" + sunroof + '\'' +
                '}';
    }


    public static class CarBuilder {
        private final String engine;
        private String color = "White";
        private String sunroof = "None";
        private final FactoryConfig factory = FactoryConfig.getInstance();

        public CarBuilder(String engine) {
            this.engine = engine;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setSunroof(String sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Car build() {
            if(factory.getCurrentCount() >= factory.getMaxCars()) {
                throw new IllegalArgumentException("Car production limit exceeded");
            }
//            factory.setCurrentCount(factory.getCurrentCount() + 1);
            factory.incrementCount();
            return new Car(this);
        }
    }
}