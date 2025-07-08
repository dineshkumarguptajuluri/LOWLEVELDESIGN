import java.util.*;
public  class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> objectList;
    Directory(String Name)
    {
        directoryName = Name;
        objectList = new ArrayList<>();
    }
    public void add(FileSystem obj)
    {
        objectList.add(obj);
    }
    public void ls()
    {
        System.out.println("The Directory Name is "+directoryName);
        for(FileSystem obj:objectList)
        {
            obj.ls();
        }
    }
}