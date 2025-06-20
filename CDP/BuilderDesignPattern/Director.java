public class Director{
    private PizzaBuilder builder;
    Director(PizzaBuilder obj )
    {
        this.builder = obj;
    }
    public Pizza buildPizza()
    {
        builder.buildDough();
        builder.buildSauce();
        builder.buildToppings();
        return builder.getPizza();
    }
}