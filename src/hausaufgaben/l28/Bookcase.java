package hausaufgaben.l28;
import java.awt.print.Book;
import  java.util.List;
import java.util.ArrayList;

public class Bookcase {
    private List<Book> books = new ArrayList<>();

    class  Book {
        String author;
        String title;
        int year;

        Book(String author, String title, int year) {
            this.author = author;
            this.title = title;
            this.year = year;
        }
        @Override
        public String toString() {
            return "Автор: " + author + " книги '" + title + "', " + year + " года издания";
        }
    }

    class Iterator {
        int index;
        Iterator () {
            this.index = 0;
        }

        public Book checkBookcase() {
            Book book = books.get(index);

            if (this.index+1<books.size()) {
                this.index++;
                System.out.println("Итератор движется вперед");
            } else {
                this.index = 0;
                System.out.println("Итератор возвращается к началу");
            }
            return  book;
        }
    }

    public int getSize() {
        return books.size();
    }

    void addBook(String author, String title, int year) {
        books.add(new Book(author,title, year));
    }

    void removeBook(int number) {
        books.remove(number);
    }

    void findBookcase() {
        System.out.println("*************");
        System.out.println(this.books.size() + " книг на книжной полке");
        for (Book b : books) {
            System.out.println(b);
        }
        System.out.println("*************");
    }
}





