public class Main {
    public static void main(String[] args) {

        Margerita obj1 = new Margerita();
        System.out.println("Cost Of Plian Pizza "+obj1.cost());
        TomatoTopping topping1 = new TomatoTopping(obj1);
        System.out.println("Cost Of Single Topping Plian Pizza "+topping1.cost());
        TomatoTopping topping2 = new TomatoTopping(topping1);
        System.out.println("Cost Of Double Topping Plian Pizza "+topping2.cost());

    }
}