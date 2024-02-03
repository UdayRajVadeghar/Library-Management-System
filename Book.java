public class Book {
    private String title;
    private String author;
    private String isbn;
    private Genre genre;
    private boolean available;

    public Book(String title, String author, String isbn, Genre genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Genre getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void displayDetails() {
        String genreInfo = (genre != null) ? "Genre: " + genre.getName() : "Genre: Not specified";
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn + "\n" + genreInfo + "\nAvailable: " + (available ? "Yes" : "No"));
    }

    public void checkOut() {
        if (available) {
            available = false;
            System.out.println("Book '" + title + "' checked out successfully.");
        } else {
            System.out.println("Sorry, '" + title + "' is not available for checkout.");
        }
    }

    public void checkIn() {
        available = true;
        System.out.println("Book '" + title + "' checked in successfully.");
    }
}
