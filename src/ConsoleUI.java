import java.time.LocalDate;
import java.util.ArrayList;

public class ConsoleUI {
    final Library library;

    public ConsoleUI (Library library){
        this.library = library;
    }

public void borrowBook() {
    library.printBooks();
    int insertedBookId = Integer.parseInt(IO.readln("Insert book ID: "));
    int insertedMemberId = Integer.parseInt(IO.readln("Insert member ID: "));

    if (library.loanBook(insertedBookId, insertedMemberId)) {
        IO.println("You have succesfully borrowed " + library.getBook(insertedBookId));
    } else {
        IO.println("Error, try again. Make sure you have entered the correct book ID and member ID");
    }
}

public void returnBook1(){
    int insertedBookId = Integer.parseInt(IO.readln("Insert book ID: "));

    library.returnBook(insertedBookId);
}

public void showLoans() {
        int insertedMemberId = Integer.parseInt(IO.readln("Insert member ID"));
        library.findLoansByMemberId(insertedMemberId);
}


public void run() {
        boolean running = true;
        while (running) {
            showMenu();
            int choice = Integer.parseInt(IO.readln("Choose option by inserting number: "));
            switch (choice) {
                case 1 -> borrowBook();
                case 2 -> returnBook1();
                case 3 -> showLoans();
                case 0 -> running = false;
                default -> IO.println("Invalid choice. Insert menu number to continue");
            }
        }
    }

    private void showMenu() {
        IO.println(String.format("""
                
                1. Borrow book
                2. Return book
                3. Show all loans
                0. End program
                
                """));
    }

}

// public Library getBook(int insertedBookId, int insertedMemberId){
//        return getBook(insertedBookId, insertedMemberId);
//    }
//
//    public boolean loanBook(int insertedBookId, int insertedMemberId) {
//        if (getBook(insertedBookId) != null || getMember(insertedMemberId) != null); {
//            if(isAvailable(insertedBookId)) {
//                Loan loan = new Loan(getBook(insertedBookId), getMember(insertedMemberId), LocalDate.now());
//                addLoan(loan);
//                return true;
//            }
//        }
//        return false;
//    }
