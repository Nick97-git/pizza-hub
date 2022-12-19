package patterns;

import java.util.Scanner;
import patterns.strategy.PizzaMakerStrategy;
import patterns.strategy.PizzaMakerStrategyImpl;

public class PizzaHub {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to PizzaHub!!!");
    System.out.println("Make your choice: 1 - Classic, 2 - Vegan");
    int pizzaNameIndex = scanner.nextInt();
    Pizza.PizzaName pizzaName = Pizza.PizzaName.values()[pizzaNameIndex - 1];
    PizzaMakerStrategy strategy = new PizzaMakerStrategyImpl();
    System.out.println(strategy.make(pizzaName));
  }
}
