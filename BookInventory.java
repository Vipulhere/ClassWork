// define a class book with the following attritube title authir publiscation year and quantity the program should allow the user to add books to the inventory display book details and check availability of the books based on its title the user can input the book details and perform the required operation menu driver interface

import java.util.*;
class Book {
    private String title;
    private String author;
    private int publicationYear;
    private int quantity;

    public Book(String title, String author, int publicationYear, int quantity) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Title : "+title+ ", Author : "+author +", Publication Year : "+ publicationYear+", Quantity : "+quantity;
    }
}

public class BookInventory {
    private List<Book> inventory;

    public BookInventory() {
        inventory = new ArrayList<>();
    }

    public void addBook(Book book) {
        inventory.add(book);
    }

    public Book findBookByTitle(String title) {
        for (Book book : inventory) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book book : inventory) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookInventory bookInventory = new BookInventory();

        while (true) {
            System.out.println("\n ****** Menu *****");
            System.out.println("1. Add Book to Inventory");
            System.out.println("2. Display Book Details");
            System.out.println("3. Check Book Availability");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Publication Year: ");
                    int publicationYear = scanner.nextInt();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();

                    Book book = new Book(title, author, publicationYear, quantity);
                    bookInventory.addBook(book);
                    System.out.println("Book added to inventory.");
                    break;

                case 2:
                    bookInventory.displayAllBooks();
                    break;

                case 3:
                    System.out.print("Enter the title to check availability: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = bookInventory.findBookByTitle(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book found in inventory.");
                        System.out.println(foundBook);
                    } else {
                        System.out.println("Book not found in inventory.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
