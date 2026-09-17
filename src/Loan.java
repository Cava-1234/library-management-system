import java.time.LocalDate;

public class Loan {

    final private Book book;
    final Member memberBorrowing;
    final private LocalDate borrowedDate;
    private LocalDate today = LocalDate.now();

    public Loan(Book book, Member memberBorrowing, LocalDate borrowedDate) {
        this.book = book;
        this.memberBorrowing = memberBorrowing;
        this.borrowedDate = LocalDate.now();
    }

    public Book getBook(){
        return book;
    }

    public String getBookTitle(){
        return book.title;
    }

    public Member getMemberBorrowing(){
        return memberBorrowing;
    }

    public boolean isAvailable(){
        return memberBorrowing == null;
    }

    public String toString(){
        return String.format("""
    Book: %sMember: %s
    Date borrowed: %s
    Return date: %s
    Is overdue? %s
    """, book, memberBorrowing, borrowedDate, borrowedDate.plusDays(14), isOverdue());
    }

    public boolean isOverdue(){
        if(today.isAfter(borrowedDate.plusDays(14))) {
            return true;
        } else {
            return false;
        }
        }

    public LocalDate getDueDate(){
        if(!(borrowedDate == null)) {
            return borrowedDate.plusDays(14);
        }
        return null;
    }

}