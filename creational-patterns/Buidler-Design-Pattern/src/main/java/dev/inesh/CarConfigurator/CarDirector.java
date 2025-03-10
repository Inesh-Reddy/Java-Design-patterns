package dev.inesh.CarConfigurator;

public class CarDirector {
    public static Car buildSportsCar(Car.CarBuilder builder) {
        return builder.setColor("Red")
                .setSunroof("Yes")
                .build();
    }
}