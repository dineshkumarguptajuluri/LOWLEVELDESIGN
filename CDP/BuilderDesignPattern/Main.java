public  class Main {
    public static void main(String[] args) {
        SpicyPizzaBuilder builder = new SpicyPizzaBuilder();
        builder = builder.setDough("Maida");
        builder = builder.setTopping("Tomato");
        builder = builder.setSauce("Chilly");
        Director dir = new Director(builder);
        Pizza one = dir.buildPizza();
        one.toPrint();
    }
}