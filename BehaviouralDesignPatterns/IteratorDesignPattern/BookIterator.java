import  java.util.*;
public class BookIterator implements Iterator<Book> {
    int ind;
    List<Book> bookList;
    public BookIterator()
    {
        System.out.println("New Book Iterator");
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
        ind =0;
    }
    public boolean hasNext()
    {
        if(ind>=bookList.size())
            return false;
        return true;
    }
    public Book next()
    {
        if(ind>=bookList.size())
            return null;
        return bookList.get(ind++);
    }
}