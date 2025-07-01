public class Student implements Clonable{
    String name;
    int age;
    private String designation;
    Student(String name,int age,String designation)
    {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
    Student(Student other)
    {
        this.name = other.name;
        this.age = other.age;
        this.designation = other.designation;
    }
    public Clonable clone()
    {
//        this also works, but when attributes grew , it may become complex.
//        return new Student(this.name,this.age,this.designation);
        return new Student(this);
    }
    public void workStatus(){
        System.out.println(this.name+" Works as "+this.designation);
    }
}