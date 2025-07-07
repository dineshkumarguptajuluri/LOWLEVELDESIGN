public class RealUserDAO implements UserDAOInterface{
    public String getName(User worker){

            return worker.getName();

    }
    public void setName(User worker,String name)
    {
        worker.setName(name);
    }

}