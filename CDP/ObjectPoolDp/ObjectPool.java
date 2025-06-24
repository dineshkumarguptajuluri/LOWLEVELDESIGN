import java.util.*;
public class ObjectPool {
    List<Resource> resourcePool;
    List<Resource> inUse;
    int initialSize = 5;
    int maxSize = 10;
    private static ObjectPool instance;
    private ObjectPool()
    {
        resourcePool = new ArrayList<>();
        inUse = new ArrayList<>();
        for(int i=0;i<initialSize;i++)
            resourcePool.add(new Resource());
        System.out.println("Object Created");
    }
    public static ObjectPool getInstance()
    {
        if(instance==null)
        {
            synchronized(ObjectPool.class)
            {
                if(instance==null)
                    instance = new ObjectPool();
            }

        }
        return instance;
    }
    public void releaseResource(Resource r)
    {
        inUse.remove(r);
        resourcePool.add(r);
        System.out.println("Object Released");
    }
    public Resource aquireResource()
    {
        if(resourcePool.size()!=0)
        {
            Resource res = resourcePool.remove(0);
            inUse.add(res);
            System.out.println("Object Got From Resource Pool");
            return res;
        }
        else if(resourcePool.size()+inUse.size()<maxSize)
        {
            Resource res = new Resource();
            inUse.add(res);
            System.out.println("Object Created Individually");
            return res;
        }
        else
            return null;
    }
}