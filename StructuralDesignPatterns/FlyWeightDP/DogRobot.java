public class DogRobot implements IRobot {
    Sprite sprite;
    String type;
    DogRobot(Sprite sprite,String type)
    {
        this.sprite = sprite;
        this.type = type;
    }
    public void display(int r,int c)
    {
        System.out.println("Cordinates Of Dog Robot "+r+" "+c);
    }
}