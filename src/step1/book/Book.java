package step1.book;

public class Book {
    String title;
    String author;
    int page;

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public void displayInfo(){
        System.out.println("제목 : " + title + ", 저자 : " + author + ", 페이지 : " + page);
    }
}
