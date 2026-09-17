import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
public class Book {

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