public class Main {
    public static void main(String[] args) {
        Functionality obj = new Functionality();
        Facade instance = new Facade(obj);
        instance.constructWall();
    }
}