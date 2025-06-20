public class Pizza{
    String dough;
    String topping;
    String sauce;
    Pizza(Pizza obj)
    {
        this.dough = obj.dough;
        this.topping = obj.topping;
        this.sauce = obj.sauce;
    }
    public Pizza() {
    }
    public void toPrint()
    {
        System.out.println("This Pizza"+" "+this.dough+" "+this.sauce+" "+this.topping);
    }


}