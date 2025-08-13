public class PersonMemento {
    int height;
    int weight;
    public PersonMemento(int height,int weight)
    {
        this.height = height;
        this.weight = weight;

        System.out.println("Snap Shot Took");
    }
    public int getWeight()
    {
        return this.weight;
    }
    public int getHeight()
    {
        return this.height;
    }

}