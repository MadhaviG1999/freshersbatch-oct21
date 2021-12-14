class Book{
    public String title;
    private String author;
    public Book(String title,String author)
    {
        this.title=title;
        this.author=author;
    }

public void readBook(){
    System.out.println("Reading" + this.title + "by" + this.author);
}
public String getAuthor()
{
    return this.author;
}
public void setAuthor(String author)
{
    this.author=author;
}
}
public class App {
    public static void main(String args[])
    {
        Book book1=new Book("goe","abc");
        System.out.println(book1.getAuthor());
    }
    
}
