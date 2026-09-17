public class Main {
    public static void main(String[] args) {

        Library cLibrary = new Library();

        // Opgave 10. refaktorer koden og lav member og book om til records i stedet for arraylists.

        Book book1 = new Book("Arthur C. Clarke", "'2001: A Space Odyssey'", "9780090898305", 1);
        Book book2 = new Book("Phillip K. Dick", "'Do Androids Dream of Electric Sheep?'", "9780345350473", 2);
        Book book3 = new Book("Ursula K. Leguin", "'The Left Hand of Darkness'", "9780060125745", 3);
        Book book4 = new Book("Frank Herbert", "'Dune'", "9780441005901", 4);

        Member member1 = new Member("Richard Hendricks", 111);
        Member member2 = new Member("Gavin Belson", 222);
        Member member3 = new Member("Donald Dunn aka Jared", 333);

        cLibrary.addBook(book1);
        cLibrary.addBook(book2);
        cLibrary.addBook(book3);
        cLibrary.addBook(book4);

        cLibrary.addMember(member1);
        cLibrary.addMember(member2);
        cLibrary.addMember(member3);

        ConsoleUI consoleUI = new ConsoleUI(cLibrary);

        consoleUI.run();

    }


}