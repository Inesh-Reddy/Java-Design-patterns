# Builder Design pattern :

## Overview
This project implements three challenges using **Builder and Singleton Design Patterns** in Java:
1. **Pizza Order Builder** (Beginner)
2. **Car Configurator with Director** (Intermediate)
3. **Email Builder in a Multi-Threaded System** (Pro)

Each challenge ensures proper encapsulation, method chaining, validation, and Singleton enforcement.

---

## Challenge 1: **Pizza Order Builder**
### Scenario
A pizza shop needs a `Pizza` class with a **required size** and **optional toppings**. A Singleton `Menu` manages available toppings.

### Implementation Steps
- **Singleton `Menu`** stores available toppings.
- **`Pizza` class** defines size and toppings.
- **`PizzaBuilder`** constructs a pizza with chaining (`addTopping().addTopping()`).
- **Validation** ensures toppings exist in the `Menu`.

### Checkpoints
✔ Singleton `Menu` works correctly (same instance, pre-populated toppings).
✔ `PizzaBuilder` enforces required size and supports chaining.
✔ `Pizza` object prints correctly (`Large: [Pepperoni, Cheese]`).
✔ Invalid toppings (e.g., Chocolate) are rejected.

### Sample Output
```
Ordered Pizza: Large: [Pepperoni, Cheese]
Invalid topping: Chocolate
```

---

## Challenge 2: **Car Configurator with Director**
### Scenario
A car manufacturer builds `Car` objects with a **required engine** and **optional color, sunroof, etc.**. A Singleton `FactoryConfig` tracks the maximum number of cars produced.

### Implementation Steps
- **Singleton `FactoryConfig`** maintains `maxCars` limit and `currentCount`.
- **`Car` class** defines required engine and optional attributes.
- **`CarBuilder`** provides fluent methods for custom configurations.
- **`Director` class** pre-builds a **sports car configuration**.
- **Validation** ensures cars cannot be built beyond `maxCars` limit.

### Checkpoints
✔ Singleton `FactoryConfig` tracks car count.
✔ `CarBuilder` constructs valid custom `Car`.
✔ `Director` generates preset `Car` configurations.
✔ Exceeding `maxCars` throws an exception.

### Sample Output
```
Custom Car: Engine: V6, Color: Red, Sunroof: Yes
Sports Car: Engine: V8, Color: Black, Sunroof: Yes
Factory limit reached! Cannot build more cars.
```

---

## Challenge 3: **Email Builder in a Multi-Threaded System**
### Scenario
An email service constructs `Email` objects with **required `to` field** and **optional `cc`, `bcc`, `subject`, `body`**. A thread-safe Singleton `EmailTemplate` stores predefined subjects.

### Implementation Steps
- **Thread-safe Singleton `EmailTemplate`** holds reusable subject lines.
- **`Email` class** defines email structure.
- **`EmailBuilder`** allows chaining methods.
- **Multi-threading** simulates concurrent email creation.
- **Validation** ensures template subjects work and Singleton is thread-safe.

### Checkpoints
✔ Singleton `EmailTemplate` is **thread-safe** (Double-Checked Locking).
✔ `EmailBuilder` constructs emails with optional fields.
✔ Template subjects (`Welcome`) work correctly.
✔ Multi-threading test confirms a **single EmailTemplate instance**.

### Sample Output
```
Thread 1: Email sent to John (Subject: Welcome)
Thread 2: Email sent to Alice (Subject: Custom Subject)
Thread 3: Email sent to Bob (Subject: Welcome)
Singleton test passed: All threads used the same EmailTemplate instance.
```

---
