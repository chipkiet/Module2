package src.ObjectOrientedProgram.BookManage;

public class Book extends Document{
    protected String author;
    protected int numPage;

    public Book(String id, String nxb, int number, String author, int numPage){
        super(id, nxb,  number);
        this.author = author;
        this.numPage = numPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numPage=" + numPage +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number=" + number +
                '}';
    }
}
