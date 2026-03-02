package libMng;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    public ArrayList<Book> searchBooks(String keyword) {
        ArrayList<Book> results = new ArrayList<>();
        keyword = keyword.toLowerCase();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword) ||
                    book.getAuthor().toLowerCase().contains(keyword) ||
                    book.getGenre().toLowerCase().contains(keyword)) {

                results.add(book);
            }
        }
        return results;
    }

    public boolean borrowBook(String memberId, String isbn) {

        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member == null || book == null) {
            System.out.println("❌ Invalid Member ID or ISBN!");
            return false;
        }

        if (!book.isAvailable()) {
            System.out.println("❌ Book already borrowed!");
            return false;
        }

        if (member.borrowBook(book)) {
            System.out.println("✅ Book borrowed successfully!");
            System.out.println("Member: " + member.getName());
            System.out.println("Book: " + book.getTitle());
            System.out.println("Due Date: 2024-02-15");
            return true;
        }

        return false;
    }

    public boolean returnBook(String memberId, String isbn) {

        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member == null || book == null) {
            System.out.println("❌ Invalid Member ID or ISBN!");
            return false;
        }

        if (member.returnBook(book)) {
            System.out.println("✅ Book returned successfully!");
            return true;
        } else {
            System.out.println("❌ This member did not borrow this book!");
            return false;
        }
    }

    public void displayAllBooks() {
        System.out.println("\n=== ALL BOOKS ===");

        if (books.isEmpty()) {
            System.out.println("No books in library!");
            return;
        }

        for (Book book : books) {
            book.displayInfo();
        }
    }

    public void displayAvailableBooks() {
        System.out.println("\n=== AVAILABLE BOOKS ===");
        boolean found = false;

        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books available at the moment!");
        }
    }
}