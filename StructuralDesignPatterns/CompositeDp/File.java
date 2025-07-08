public  class File implements FileSystem{

    String fileName;
    File(String name)
    {
        fileName = name;
    }
    public void ls()
    {
        System.out.println("The File Name is "+fileName);
    }
}