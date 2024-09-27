import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;

    }
    @Override
    public String toString(){
        return "Book{" + "name='" + name +'\'' + author + '\'' + '}';
    }
}
class Mylibrary{
   public ArrayList<Book> books;
   public Mylibrary(ArrayList<Book> books){
    this.books = books;
   }
   public void addBook(Book book){
    System.out.println("The book has been added to the library");
    this.books.add(book);
   }
   public void issueBook(Book book, String issue_to){
    System.out.println("The book has been issued from the library" + issue_to);
      this.books.remove(book);
   }
   public void returnBook(Book b){
    System.out.println("The book has been return from the library to ");
    this.books.add(b);
   }
}
public class Library{
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithm1", "CLRS1");
        bk.add(b1);

        Book b2 = (new Book("Algorithm2", "CLRS2"));
        bk.add(b2); 

        Book b3 = (new Book("Algorithm3", "CLRS3"));
        bk.add(b3);
        
        Mylibrary l = new Mylibrary(bk);
        l.addBook(new Book("Algo4", "myAuthor"));
        System.out.println(l.books);
        l.issueBook(b3, " Rajat");
        System.out.println(l.books);
    }
}