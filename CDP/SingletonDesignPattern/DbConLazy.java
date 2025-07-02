public class DbConLazy {
    public static DbConLazy conObj;
    private DbConLazy(){
        System.out.println("Object Created");
    }
    public static DbConLazy getInstance()
    {
        if(conObj==null)
            conObj = new DbConLazy();
        return conObj;
    }
}