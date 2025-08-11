import  java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Book one = new Book("Mahabhartaha",18);
        BookIterator iterator = (BookIterator)one.getIterator();
        list.add(one);
        list.add(new Book("Ramayana",4));
        list.add(new Book("Murugan",10));
        list.add(new Book("Bible",16));
        list.add(new Book("Khuran",15));
        list.add(new Book("Wings Of Fire",233));
        iterator.setBookList(list);
        while(iterator.hasNext())
        {
            Book here = iterator.next();
            System.out.println(here.getName()+" iS name and pages are "+here.getPages());
        }

    }
}