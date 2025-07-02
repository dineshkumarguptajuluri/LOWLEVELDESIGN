public  class DbConSynchronized {
    public static DbConSynchronized conObj = new DbConSynchronized();
    private DbConSynchronized()
    {
        System.out.println("Object Created");
    }
    synchronized public static DbConSynchronized getInstance()
    {
        if(conObj==null)
            conObj = new DbConSynchronized();
        return conObj;
    }
}