package step2.outerClass;

public class Library {
    private final Book[] books;
    private int count;

    public Library(int size) {
        this.books = new Book[size];
        count = 0;
    }

    public void addBook(String title, String author){
        if (count >= books.length){
            System.out.println("도서 저장 공간 부족");
            return;
        }
        books[count++] = new Book(title, author);

    }

    public void showBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public class Book{
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
    }
}
