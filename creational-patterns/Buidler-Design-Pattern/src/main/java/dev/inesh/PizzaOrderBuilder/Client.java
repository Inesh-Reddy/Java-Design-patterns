package dev.inesh.PizzaOrderBuilder;

public class Client {
    public static void main(String[] args) throws Exception {

        Pizza pizza1 = new Pizza.PizzaBuilder("Large").addTopping("Pepperoni").addTopping("Cheese").build();
        System.out.println(pizza1);

        try {
            Menu oldMenu = Menu.getInstance();
            Menu newMenu = Menu.getInstance();
            System.out.println("Same instance? " + (oldMenu == newMenu));
            System.out.println("Available toppings: " + oldMenu.getToppings());
            System.out.println("Is Pepperoni valid? " + oldMenu.isValidTopping("Pepperoni"));
            System.out.println("Is Salami valid? " + oldMenu.isValidTopping("Salami"));

            Pizza pizza = new Pizza.PizzaBuilder("Large")
                    .addTopping("Pepperoni")
                    .addTopping("Cheese")
                    .addTopping("Salami")
                    .build();
            System.out.println("Pizza: " + pizza);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
