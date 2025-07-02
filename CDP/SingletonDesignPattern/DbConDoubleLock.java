public class DbConDoubleLock {
    public  static DbConDoubleLock conObj ;
    private DbConDoubleLock(){
        System.out.println("Object Created");
    }
    public static DbConDoubleLock getInstance()
    {
        if(conObj==null)
        {
            synchronized (DbConDoubleLock.class)
            {
                if(conObj==null)
                    conObj = new DbConDoubleLock();
            }
        }
        return conObj;
    }
}