public class Main {
    public static void main(String[] args) {
        IRobot obj1 = IRobotFactory.getRobot("HUMANOID");
        obj1.display(2,3);
        IRobot obj2 = IRobotFactory.getRobot("HUMANOID");
        obj1.display(3,3);
        IRobot obj3 = IRobotFactory.getRobot("DOG");
        obj1.display(1,3);
    }
}