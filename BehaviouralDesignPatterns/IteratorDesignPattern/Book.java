public class Book {
    public String name;
    public int pages;
    public Book(String name,int pages)
    {
        this.name =name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }
    public Iterator getIterator()
    {
        return new BookIterator();
    }
}