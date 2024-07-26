package ch7_inner_nesting_class.pro5_도서관_관리_시스템;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        this.books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author){
//        final int arraySize = books.length;     // 4
//
//        if( arraySize <= bookCount){
//            System.out.println("도서관 저장 공간이 부족합니다.");
//            return;
//        }
//
//        books[bookCount] = new Book(title,auther);  // 0 , 1 , 2 ,3
//        bookCount++;                                // 1 , 2 , 3 ,4

        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks(){
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i< books.length; i++){
            System.out.println("도서 제목 : " + books[i].title + " 저자 : " + books[i].author );
        }
    }

    class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
