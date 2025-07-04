public class Main {
    public static void main(String[] args) {
        BreatheImplementor land = new LandBreatheImplementor();
        BreatheImplementor air = new AirBreatheImplementor();
        LivingThings obj1 = new AirLiving(air);
        LivingThings obj2 = new LandLiving(land);
        obj1.breatheProcess();
        obj2.breatheProcess();
    }
}