class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}

public class bookstore {
    private String[] booksInStock;
    private int[] booksAvailability;
    private Person[] libraryMembers;
    private double revenue;

    public bookstore() {
        // Initialize arrays to store book titles, availability, and library members
        booksInStock = new String[50];
        booksAvailability = new int[50];
        libraryMembers = new Person[50];
        revenue = 0.0;
    }

    public void addBook(String bookTitle) {
        // Add a book to the inventory
        for (int i = 0; i < booksInStock.length; i++) {
            if (booksInStock[i] == null) {
                booksInStock[i] = bookTitle;
                booksAvailability[i] = 1;
                break; // Exit loop after adding
            }
        }
    }

    public void registerLibraryMember(Person person) {
        // Register a library member
        for (int i = 0; i < libraryMembers.length; i++) {
            if (libraryMembers[i] == null) {
                libraryMembers[i] = person;
                break; // Exit loop after registering
            }
        }
    }

    public void lendBook(String bookTitle, Person person) {
        // Lend a book to a library member
        for (int i = 0; i < booksInStock.length; i++) {
            if (booksInStock[i] != null && booksInStock[i].equals(bookTitle) && booksAvailability[i] > 0) {
                booksAvailability[i]--;
                System.out.println(person.getName() + " has borrowed '" + bookTitle + "'.");
                return; // Exit the method after lending
            }
        }
        System.out.println("Sorry, '" + bookTitle + "' is not available.");
    }

    public void displayAvailableBooks() {
        // Display available books
        System.out.println("Available Books:");
        for (int i = 0; i < booksInStock.length; i++) {
            if (booksInStock[i] != null && booksAvailability[i] > 0) {
                System.out.println(booksInStock[i]);
            }
        }
    }

    public static void main(String[] args) {
        bookstore library = new bookstore();
        library.addBook("Book 1");
        library.registerLibraryMember(new Person("Allan", 23));
        library.lendBook("Great Gatsby", library.libraryMembers[0]);
        library.displayAvailableBooks();
    }
}
