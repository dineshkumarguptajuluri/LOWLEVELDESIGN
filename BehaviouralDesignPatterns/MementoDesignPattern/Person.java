public  class Person
{
    String name;
    int height;
    int weight;
    public Person(String name,int height,int weight)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public void setHeight(int height)
    {
        System.out.println(this.name+" Height Changed From "+this.height+" To "+height);
        this.height = height;
    }
    public void setWeight(int weight)
    {
        System.out.println(this.name+" Weight Changed From "+this.weight+" To "+weight);
        this.weight = weight;
    }
    public void restoreMemento(PersonMemento personMemento)
    {
        setWeight(personMemento.getWeight());
        setHeight(personMemento.getHeight());
        System.out.println("Previous Memento Restored");
    }
    public PersonMemento createMemento()
    {
        return new  PersonMemento(this.height,this.weight);
    }



}