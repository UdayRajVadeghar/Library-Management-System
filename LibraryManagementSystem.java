public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Initializing the library
        Library library = new Library();

        // Creating genres
        Genre mythological = new Genre("Mythological");
        Genre historicalFiction = new Genre("Historical Fiction");

        // Creating new books from the Book class
        Book book1 = new Book("The Immortals of Meluha", "Amish Tripathi", "9789381626344", mythological);
        Book book2 = new Book("The Palace of Illusions", "Chitra Banerjee Divakaruni", "9780330458534", historicalFiction);
        Book book3 = new Book("Half Girlfriend", "Chetan Bhagat", "9788129135728", historicalFiction);

        // Adding books to the library collection
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Displaying all books in the library
        library.displayAllBooks();

        // Introducing library members
        User user1 = new User("raj_kumar", "raja123");//any name of your choice as an user ID with the autorized passwords
        User user2 = new User("priya_sharma", "p@ssw0rd");

        // Adding members to the library community
        library.addUser(user1);
        library.addUser(user2);

        // Displaying details of user1
        user1.displayDetails();

        // User1 checking out book1
        user1.checkOutBook(book1);

        // User1 returning book1
        user1.returnBook(book1);

        // Displaying all books in the library after transactions
        library.displayAllBooks();

        // Removing user2 from the library
        library.removeUser(user2);

        // The due books notification
        library.notifyDueBooks();
    }
}
