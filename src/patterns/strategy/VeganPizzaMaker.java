package patterns.strategy;

import patterns.Pizza;

public class VeganPizzaMaker implements PizzaMaker {
  @Override
  public Pizza make() {
    Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder();
    return pizzaBuilder.addDough()
        .setName(Pizza.PizzaName.VEGAN)
        .addSauce()
        .addCheese()
        .addTomatoes()
        .cook();
  }
}
