import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library( ) {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book '" + book.getTitle() + "' added to the library.");
    }

    public void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book '" + book.getTitle() + "' removed from the library.");
        } else {
            System.out.println("Book '" + book.getTitle() + "' not found in the library.");
        }
    }

    public void displayAllBooks() {
        System.out.println("All Books in the Library:");
        for (Book book : books) {
            book.displayDetails();
        }
    }

    public List<Book> searchBooks(String keyword) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())
                    || book.getAuthor().toLowerCase().contains(keyword.toLowerCase())
                    || (book.getGenre() != null && book.getGenre().getName().toLowerCase().contains(keyword.toLowerCase()))) {
                results.add(book);
            }
        }
        return results;
    }

    public void notifyDueBooks() {
        // Implementation to notify users about due books
        // You can use the current date and the due date of borrowed books for this notification.
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User '" + user.getUsername() + "' added to the library.");
    }

    public void removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
            System.out.println("User '" + user.getUsername() + "' removed from the library.");
        } else {
            System.out.println("User '" + user.getUsername() + "' not found in the library.");
        }
    }
}
