package libMng;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Preloaded books (matching sample output)
        library.addBook(new Book("978-0-262-03384-8",
                "Introduction to Algorithms",
                "Thomas Cormen",
                "Computer Science"));

        library.addBook(new Book("978-0-13-468599-1",
                "Effective Java",
                "Joshua Bloch",
                "Programming"));

        library.addBook(new Book("978-1-56619-909-4",
                "Clean Code",
                "Robert Martin",
                "Programming"));

        // Preloaded member
        library.addMember(new Member("M001", "Alice Johnson", "9999999999"));

        int choice;

        do {
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. Add New Book");
            System.out.println("2. Register New Member");
            System.out.println("3. Display All Books");
            System.out.println("4. Display Available Books");
            System.out.println("5. Search Books");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.println("\n=== ADD NEW BOOK ===");
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    library.addBook(new Book(isbn, title, author, genre));
                    System.out.println("✅ Book added successfully!");
                    break;

                case 2:
                    System.out.println("\n=== REGISTER NEW MEMBER ===");
                    System.out.print("Enter Member ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();

                    library.addMember(new Member(id, name, contact));
                    System.out.println("✅ Member registered successfully!");
                    break;

                case 3:
                    library.displayAllBooks();
                    break;

                case 4:
                    library.displayAvailableBooks();
                    break;

                case 5:
                    System.out.println("\n=== SEARCH BOOKS ===");
                    System.out.print("Enter search keyword: ");
                    String keyword = sc.nextLine();

                    ArrayList<Book> results = library.searchBooks(keyword);

                    System.out.println("\nSearch Results:");
                    for (Book book : results) {
                        book.displayInfo();
                    }
                    break;

                case 6:
                    System.out.println("\n=== BORROW BOOK ===");
                    System.out.print("Enter Member ID: ");
                    String mId = sc.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String bIsbn = sc.nextLine();
                    library.borrowBook(mId, bIsbn);
                    break;

                case 7:
                    System.out.println("\n=== RETURN BOOK ===");
                    System.out.print("Enter Member ID: ");
                    String rmId = sc.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String rIsbn = sc.nextLine();
                    library.returnBook(rmId, rIsbn);
                    break;

                case 8:
                    System.out.println("Thank you for using Library System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}