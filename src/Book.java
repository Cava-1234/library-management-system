import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public record Book(String authorName, String title, String numberISBN, int iD){}

    Book book1 = new Book("Arthur C. Clarke", "'2001: A Space Odyssey'", "9780090898305", 1);
    Book book2 = new Book("Phillip K. Dick", "'Do Androids Dream of Electric Sheep?'", "9780345350473", 2);
    Book book3 = new Book("Ursula K. Le Guin", "'The Left Hand of Darkness'", "9780060125745", 3);
    Book book4 = new Book("Frank Herbert", "'Dune'", "9780441005901", 4);
    Book book5 = new Book("Isaac Asimov", "'Foundation'", "9780553293357", 5);
    Book book6 = new Book("Rovert A. Heinlein", "'Starship troopers'", "9783404240012", 6);

    final String authorName;
    final String title;
    final String numberISBN;
    final int iD;
    Member memberBorrowing;

    public Book(String authorName, String title, String numberISBN, int iD) {
        this.authorName = authorName;
        this.title = title;
        this.numberISBN = numberISBN;
        this.iD = iD;
    }

    public boolean isAvailable() {
        return memberBorrowing == null;
    }

    public String toString() {
        return String.format(""" 
                Author: %s
                Title: %s
                ISBN: %s
                ID: (%s)
                """, authorName, title, numberISBN, iD);
    }

    public boolean getBook(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return iD == book.iD && Objects.equals(book.iD, book.iD);
    }

    public int getId() {
        return iD;
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title == book.title && Objects.equals(title, book.title);
    }
}

//public boolean loan (Member member) {
//        if(isAvailable()) {
//            memberBorrowing = member;
//            IO.println(String.format("Book has been borrowed by %s", member));
//            borrowDate = LocalDate.now();
//            return true;
//        } else {
//            IO.println("Book is not available");
//            return false;
//        }
//    }
//
//    public LocalDate getDueDate(){
//        if (!(borrowDate == null)) {
//            return borrowDate.plusDays(14);
//        }
//        return null;
//    }
//
//    public void returnBook() {
//        if(!isAvailable()) {
//            memberBorrowing = null;
//            borrowDate = null;
//            IO.println(title + "has been returned");
//        } else {
//            IO.println(title + "is already in the library");
//        }
//    }