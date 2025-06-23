class Library {
    String name = "Central Library";
    String address = "Lab St.";
    String established = "2002";
    int numberOfBooks = 5000;
    boolean isOpen = true;
    Librarian librarian;
    Book book;
    Member member;

    void displayLibrary() {
        System.out.println("Library: " + this.name + ", Address: " + this.address + ", Established: " + this.established + ", Number of Books: " + this.numberOfBooks + ", Open: " + this.isOpen);
    }

    void addLibrarian() {
        librarian = new Librarian();
    }

    void addBook() {
        book = new Book();
    }

    void addMember() {
        member = new Member();
    }
}

class Librarian {
    String name = "Ramesh";
    int empID = 101;
    int age = 45;
    double salary = 1000;
    String qualification = "MCA";

    void displayLibrarian() {
        System.out.println("Librarian: " + this.name + ", Employee ID: " + this.empID + ", Age: " + this.age + ", Salary: " + this.salary + ", Qualification: " + this.qualification);
    }
}

class Book {
    String title = "Nilavnti";
    String author = "samir shekh";
    double price = 200;
    String isbn = "23-32-321";
    int pages = 300;

    void displayBook() {
        System.out.println("Book: " + this.title + " by " + this.author + ", Price:" + this.price + ", ISBN: " + this.isbn + ", Pages: " + this.pages);
    }
}

class Member {
    String name = "Suresh";
    int memberID = 202;
    int age = 30;
    String membershipType = "Annual";
    boolean hasOverdueBooks = false;

    void displayMember() {
        System.out.println("Member: " + this.name + ", Member ID: " + this.memberID + ", Age: " + this.age + ", Membership Type: " + this.membershipType + ", Has Overdue Books: " + this.hasOverdueBooks);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.displayLibrary();
        library.addLibrarian();
        library.librarian.displayLibrarian();
        library.addBook();
        library.book.displayBook();
        library.addMember();
        library.member.displayMember();
    }
}