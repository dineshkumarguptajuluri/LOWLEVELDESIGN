public class Main {
    public static void main(String args[])
    {
        DbConDoubleLock obj1 = DbConDoubleLock.getInstance();
        DbConLazy obj2 = DbConLazy.getInstance();
        DbConnectionEarly obj3 = DbConnectionEarly.getInstance();
        DbConSynchronized obj4 = DbConSynchronized.getInstance();
    }
}