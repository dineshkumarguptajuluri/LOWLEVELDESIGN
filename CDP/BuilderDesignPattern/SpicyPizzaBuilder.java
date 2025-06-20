public class SpicyPizzaBuilder implements PizzaBuilder{
    private Pizza pizza = new Pizza();
    private String dough, sauce, topping;
    public void buildDough()
    {
        pizza.dough = this.dough;

    }
    public void buildSauce()
    {
        pizza.sauce = this.sauce;

    }
    public void buildToppings()
    {
        pizza.topping = this.topping;
    }
    public Pizza getPizza()
    {
        return this.pizza;
    }
    public SpicyPizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    public SpicyPizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public SpicyPizzaBuilder setTopping(String topping) {
        this.topping = topping;
        return this;
    }
}