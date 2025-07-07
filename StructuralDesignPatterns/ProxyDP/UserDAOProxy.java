public class UserDAOProxy implements UserDAOInterface{
    private static RealUserDAO daoObj = new RealUserDAO();
    private User user;
    public UserDAOProxy(User user)
    {
        this.user=user;
    }
    public String getName(User worker){
        if(user.getAuthority()>=2)
            return daoObj.getName(worker);
        return null;
    }
    public void setName(User worker,String name)
    {
        if(user.getAuthority()>3)
            daoObj.setName(worker,name);
    }
}