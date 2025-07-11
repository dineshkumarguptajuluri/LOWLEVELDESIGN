public class HumanoidRobot implements IRobot {
    Sprite sprite;
    String type;
    HumanoidRobot(Sprite sprite,String type)
    {
        this.sprite = sprite;
        this.type = type;
    }
    public void display(int r,int c)
    {
        System.out.println("Cordinates Of Human Robot "+r+" "+c);
    }
}