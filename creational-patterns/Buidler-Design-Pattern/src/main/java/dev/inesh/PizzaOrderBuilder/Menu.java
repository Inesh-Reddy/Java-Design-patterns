package dev.inesh.PizzaOrderBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Menu {
    private static final Menu instance = new Menu();

    private final List<String> toppings;

    private Menu() {
        this.toppings = new ArrayList<>(Arrays.asList("Pepperoni", "Mushrooms", "Cheese", "Olives"));
    }

    public static Menu getInstance() {
        return instance;
    }

    public List<String> getToppings() {
        return Collections.unmodifiableList(toppings);
    }

//    Validation
    public boolean isValidTopping(String topping) {
        return toppings.contains(topping);
    }
}
