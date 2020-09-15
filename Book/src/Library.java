import java.util.LinkedList;

public class Library {

    public Library(){
        this.books = new LinkedList<Book>();
    }


    public Library addBook(Book addBook) {
        this.books.add(aBook);
        return this;
    }
    // review chaining

    public int countBooks(){

    }

    public LinkedList<Book> checkedOut() {
        LinkedList<Book> checkedOutBooks = new LinkedList<>();
        for(Book aBook : books){
            if(!aBook.isAvailable){
                checkedOutBooks.add(aBook);
            }
        }
    }
}
