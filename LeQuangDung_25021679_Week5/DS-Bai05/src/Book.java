public abstract class Book {
    private String id;
    private String title;
    private String Author;
    private int year;
    public Book(String id, String title, String author, int year){
        this.id = id;
        this.title = title;
        this.Author = author;
        this.year = year;
    }

    protected String getId() {
        return id;
    }

    protected String getTitle() {
        return title;
    }

    protected int getYear() {
        return year;
    }

    protected String getAuthor() {
        return Author;
    }
    public String toString(){
        return "Id : " + id + "| Tieu de : " + title + "| Nam xuat ban : " + year + "| Tac gia : " + Author;
    }
}