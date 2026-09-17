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
        for (int i = 0; i < memberList.size(); i++) {
            if (memberList.get(i).getId() == insertedId) {
                return memberList.get(i);
            }
        }
        return null;
    }

    public Book getBook(int insertedId) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == insertedId) {
                return bookList.get(i);
            }
        }
        return null;
    }

    public Loan getLoans() {
        for (int i = 0; i < bookList.size(); i++) {
                return loanList.get(i);
            }
        return null;
    }

    public boolean isAvailable(int insertedBookId) {
        for (int i = 0; i < loanList.size(); i++) {
            if (loanList.get(i).getBook().getId() == insertedBookId) {
                return false;
            }
        } return true;
    }

    public boolean loanBook(int insertedBookId, int insertedMemberId) {
        if (getBook(insertedBookId) != null || getMember(insertedMemberId) != null); {
            if(isAvailable(insertedBookId)) {
                Loan loan = new Loan(getBook(insertedBookId), getMember(insertedMemberId), LocalDate.now());
                addLoan(loan);
                return true;
            }
        }
            return false;
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
        if (bookExist ==false) {
            IO.println("Book is already in the library, or doesn't exist");
        }
    }

    public void findLoansByMemberId(int insertedMemberId) {
        String booksLoanedByMember = "";
        for(int i = 0; i < loanList.size(); i ++) {
            if(insertedMemberId == loanList.get(i).getMemberBorrowing().getId()) {
                booksLoanedByMember += loanList + "\n";
            }
            IO.println(booksLoanedByMember);
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

    public void printMembers () {
        IO.println("Library member list:" + "\n");
        String completeMemberList = "";
        for (Member member : memberList) {
            completeMemberList += member + "\n";
        }
        IO.println(completeMemberList);
    }
}