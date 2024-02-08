import java.util.ArrayList;
import java.util.List;

//we have to use lists in order to have a continuous array of elements in a given space

public class User {
    private String username;
    private String password;
    private List<Book> booksCheckedOut;
    private List<Book> borrowHistory;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.booksCheckedOut = new ArrayList<>();
        this.borrowHistory = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }
    

    public void displayDetails() {
        System.out.println("User: " + username + "\nBooks Checked Out: " + booksCheckedOut.size());
    }

    public void checkOutBook(Book book) {
        if (book.isAvailable()) {
            book.checkOut();
            booksCheckedOut.add(book);
        } else {
            System.out.println("Book not available for checkout.");
        }
    }

    public void returnBook(Book book) {
        if (booksCheckedOut.contains(book)) {
            book.checkIn();
            booksCheckedOut.remove(book);
            borrowHistory.add(book);
        } else {
            System.out.println("You haven't checked out this book.");
        }
    }
}
