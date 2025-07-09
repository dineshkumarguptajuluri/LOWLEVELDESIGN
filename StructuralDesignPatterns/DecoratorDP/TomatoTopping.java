public class TomatoTopping extends ToppingWrapper{

    TomatoTopping(BasePizza basePizza)
    {
        super(basePizza);
    }
    public int cost()
    {
        return basePizza.cost()+50;
    }
}