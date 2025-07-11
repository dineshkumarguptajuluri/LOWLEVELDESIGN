import java.util.*;
import java.io.*;
public class IRobotFactory {
    private static HashMap<String,IRobot> robotRAMCache = new HashMap<>();
    public static IRobot getRobot(String type)
    {
        if(robotRAMCache.containsKey(type))
        {
            System.out.println("Cache Memory Is Used");
            return robotRAMCache.get(type);
        }
        else if(type == "HUMANOID")
        {
            System.out.println("HUMANOID IS CREATED");
            Sprite sprite = new Sprite();
            IRobot obj = new HumanoidRobot(sprite,type);
            robotRAMCache.put(type,obj);
            return obj;
        }
        else if(type == "DOG")
        {
            Sprite sprite = new Sprite();
            IRobot obj = new DogRobot(sprite,type);
            robotRAMCache.put(type,obj);
            System.out.println("DOG IS CREATED");
            return obj;
        }
        return null;
    }
}