public class Main {
    public static void main(String args[])
    {
        Student first = new Student("Dinesh",20,"Developer");
        first.workStatus();
        Student second = (Student)first.clone();
        second.name = "Karthik";
        second.workStatus();
    }
}