public class User {
    private String name;
    private int id;
    private int authority;
    public User(String name,int Id,int authority)
    {
        this.name = name;
        this.id = id;
        this.authority = authority;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String newName)
    {
        this.name = newName;
        System.out.println("Name is Changed");
    }
    public int getAuthority()
    {
        return this.authority;
    }

}