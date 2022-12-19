package patterns.strategy;

import patterns.Pizza;

public class PizzaMakerStrategyImpl implements PizzaMakerStrategy {
  @Override
  public Pizza make(Pizza.PizzaName name) {
    switch (name) {
      case VEGAN:
        return new VeganPizzaMaker().make();
      default:
      case CLASSIC:
        return new ClassicPizzaMaker().make();
    }
  }
}
