package dev.inesh.CarConfigurator;

public class Client {
    public static void main(String[] args) {
        try {
            Car.CarBuilder builder = new Car.CarBuilder("V8");
            Car sportsCar = CarDirector.buildSportsCar(builder);
            System.out.println(sportsCar);

            Car customCar = new Car.CarBuilder("V6").setColor("Black").setSunroof("Yes").build();
            System.out.println(customCar);

            Car.CarBuilder builder2 = new Car.CarBuilder("V12");
            Car sportsCar2 = CarDirector.buildSportsCar(builder2);
            System.out.println(sportsCar2);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}