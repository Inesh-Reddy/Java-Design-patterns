package dev.inesh.PizzaOrderBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private final String size;
    private final List<String> toppings;

    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.toppings = (builder.toppings != null) ? new ArrayList<>(builder.toppings) : new ArrayList<>();
    }

    public String getSize() {
        return size;
    }

    public List<String> getToppings() {
        return Collections.unmodifiableList(toppings);
    }

    @Override
    public String toString() {
        return size + ": " + toppings;
    }

    public static class PizzaBuilder {
        private final String size;
        private List<String> toppings = null;
        Menu menu  = Menu.getInstance();

        public PizzaBuilder(String size) {
            this.size = size;
            this.toppings = new ArrayList<>();
        }
        public PizzaBuilder addTopping(String topping) throws Exception {
            if(!menu.isValidTopping(topping)) {
                throw new Exception("Invalid topping");
            }
            this.toppings.add(topping);
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }
}