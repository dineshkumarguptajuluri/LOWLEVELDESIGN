public class Main {
    public static void main(String[] args) {
        User obj = new User("Dinesh",1,4);
        User obj1 = new User("Karthik",2,2);
        UserDAOProxy proxy = new UserDAOProxy(obj);
        UserDAOProxy proxy1 = new UserDAOProxy(obj1);
        System.out.println("Name is "+proxy1.getName(obj));
        proxy1.setName(obj,"Dinnu");
        System.out.println("Name is "+proxy1.getName(obj));
        System.out.println("Name is "+proxy.getName(obj1));
        proxy.setName(obj1,"Karthi");
        System.out.println("Name is "+proxy.getName(obj1));


    }
}