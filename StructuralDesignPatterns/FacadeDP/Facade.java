public class Facade {

    Functionality instance;
    Facade(Functionality instance)
    {
        this.instance = instance;
    }
    public void constructWall()
    {
        instance.getWorkers();
        instance.buildWall();
        instance.colourWall();
        System.out.println("Total Construction Completd");
    }
}