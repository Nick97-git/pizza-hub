package patterns.strategy;

import patterns.Pizza;

public class ClassicPizzaMaker implements PizzaMaker {
  @Override
  public Pizza make() {
    Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder();
    return pizzaBuilder.addDough()
        .setName(Pizza.PizzaName.CLASSIC)
        .addSauce()
        .addCheese()
        .addOnions()
        .addSausage()
        .cook();
  }
}
