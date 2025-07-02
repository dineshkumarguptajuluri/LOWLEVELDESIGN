public class DbConnectionEarly {
    public static DbConnectionEarly conObj = new DbConnectionEarly();
    private DbConnectionEarly(){
        System.out.println("Object Created");
    }
    public static  DbConnectionEarly getInstance()
    {
        return conObj;
    }
}