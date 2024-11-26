package nested.test.ex1;

public class Library {
    private final Book[] books;
    private int bookCount = 0;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(String title, String author) {
        if (bookCount == books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");

        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }

    }

    private static class Book {
        private final String title;
        private final String author;

        private Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
