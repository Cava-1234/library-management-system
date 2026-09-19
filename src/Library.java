import java.time.LocalDate;
import java.util.ArrayList;
public class Library {

    final ArrayList<Book> bookList;
    final ArrayList<Member> memberList;
    final private ArrayList<Loan> loanList;

    public Library() {
        bookList = new ArrayList<>();
        memberList = new ArrayList<>();
        loanList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void addMember(Member member) {
        memberList.add(member);
    }

    public void addLoan(Loan loan) {
        loanList.add(loan);
    }

    public Member getMember(int insertedId) {
        for (Member member : memberList) {
            if (member.getId() == insertedId) {
                return member;
            }
        }
        return null;
    }

    public Book getBook(int insertedId) {
        for (Book book : bookList) {
            if (book.getId() == insertedId) {
                return book;
            }
        }
        return null;
    }

    public Loan getLoan(int insertedId) {
        for (Loan loan : loanList) {
            if (loan.getMemberBorrowing() == insertedId) {
                return loan;
            }
        }
        return null;
    }

    public boolean isAvailable(int insertedBookId) {
        for (Loan loan : loanList) {
            if (loan.getBook().getId() == insertedBookId) {
                return false;
            }
        }
        return true;
    }

    public boolean loanBook(int insertedBookId, int insertedMemberId) {
        if (getBook(insertedBookId) != null || getMember(insertedMemberId) != null) ; {
            if (isAvailable(insertedBookId)) {
                Loan loan = new Loan(getBook(insertedBookId), getMember(insertedMemberId), LocalDate.now());
                addLoan(loan);
                return true;
            }
            return false;
        }
    }

    public void returnBook(int insertedBookId){
    boolean bookExist = false;
        for(int i = 0; i < loanList.size(); i++) {
            if(loanList.get(i).getBook().getId() == insertedBookId) {
                loanList.remove(i);
                IO.println("Booktitle: " + getBook(insertedBookId).title + " has been returned");
                bookExist = true;
            }
        }
        if (!bookExist) {
            IO.println("Book is already in the library, or doesn't exist");
        }
    }

    public void findLoansByMemberId(int insertedMemberId) {
        for (int i = 0; i < loanList.size(); i++) {
            if (loanList.get(i).getMemberBorrowing() == insertedMemberId) {
                IO.println(loanList.get(i));
            }
        }
    }

    public void printBooks () {
        IO.println("Books available at this library:" + "\n");
        String completeBookList = "";
        for (Book book : bookList) {
            completeBookList += book + "\n";
        }
        IO.println(completeBookList);
    }
}