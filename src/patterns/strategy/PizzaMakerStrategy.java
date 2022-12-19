package patterns.strategy;

import patterns.Pizza;

public interface PizzaMakerStrategy {
  Pizza make(Pizza.PizzaName name);
}
