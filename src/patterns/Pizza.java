package patterns;

public class Pizza {
  private final boolean hasDough;
  private final boolean hasSauce;
  private final boolean hasOnions;
  private final boolean hasTomatoes;
  private final boolean hasSausage;
  private final boolean hasCheese;
  private final PizzaName name;

  public Pizza(PizzaBuilder builder) {
    hasSausage = builder.hasSausage;
    hasTomatoes = builder.hasTomatoes;
    hasCheese = builder.hasCheese;
    hasOnions = builder.hasOnions;
    hasDough = builder.hasDough;
    hasSauce = builder.hasSauce;
    name = builder.name;
  }

  @Override
  public String toString() {
    return "Pizza{" +
        "hasDough=" + hasDough +
        ", hasSauce=" + hasSauce +
        ", hasOnions=" + hasOnions +
        ", hasTomatoes=" + hasTomatoes +
        ", hasSausage=" + hasSausage +
        ", hasCheese=" + hasCheese +
        ", name=" + name +
        '}';
  }

  public static class PizzaBuilder {
    private boolean hasDough;
    private boolean hasSauce;
    private boolean hasOnions;
    private boolean hasTomatoes;
    private boolean hasSausage;
    private boolean hasCheese;
    private PizzaName name;

    public PizzaBuilder setName(PizzaName name) {
      this.name = name;
      return this;
    }

    public PizzaBuilder addDough() {
      hasDough = true;
      return this;
    }

    public PizzaBuilder addSauce() {
      hasSauce = true;
      return this;
    }

    public PizzaBuilder addCheese() {
      hasCheese = true;
      return this;
    }

    public PizzaBuilder addSausage() {
      hasSausage = true;
      return this;
    }

    public PizzaBuilder addOnions() {
      hasOnions = true;
      return this;
    }

    public PizzaBuilder addTomatoes() {
      hasTomatoes = true;
      return this;
    }

    public Pizza cook() {
      return new Pizza(this);
    }
  }

  public enum PizzaName {
    CLASSIC, VEGAN;
  }
}
