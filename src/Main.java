void main() {

    Library cLibrary = new Library();

    // Opgave 10. refaktorer koden og lav member og book om til records i stedet for arraylists.

    Book book1 = new Book("Arthur C. Clarke", "'2001: A Space Odyssey'", "9780090898305", 1);
    Book book2 = new Book("Phillip K. Dick", "'Do Androids Dream of Electric Sheep?'", "9780345350473", 2);
    Book book3 = new Book("Ursula K. Le Guin", "'The Left Hand of Darkness'", "9780060125745", 3);
    Book book4 = new Book("Frank Herbert", "'Dune'", "9780441005901", 4);
    Book book5 = new Book("Isaac Asimov", "'Foundation'", "9780553293357", 5);
    Book book6 = new Book("Robert A. Heinlein", "'Starship troopers'", "9783404240012", 6);

    Member member1 = new Member("Richard Hendricks", 111);
    Member member2 = new Member("Gavin Belson", 222);
    Member member3 = new Member("Donald Dunn aka Jared", 333);
    Member member4 = new Member("Dinesh Chugtai", 444);
    Member member5 = new Member("Bertram Gilfoyle", 555);
    Member member6 = new Member("Monica Hall", 666);
    Member member7 = new Member("Ehrlich Bachmann", 777);
    Member member8 = new Member("Jian Yang", 888);
    Member member9 = new Member("Nelson Bighetti aka Big Head", 999);
    Member member10 = new Member("Peter Gregory", 997);

    cLibrary.addBook(book1); cLibrary.addBook(book2); cLibrary.addBook(book3); cLibrary.addBook(book4);
    cLibrary.addBook(book5); cLibrary.addBook(book6);

    cLibrary.addMember(member1); cLibrary.addMember(member2); cLibrary.addMember(member3); cLibrary.addMember(member4);
    cLibrary.addMember(member5); cLibrary.addMember(member6); cLibrary.addMember(member7); cLibrary.addMember(member8);
    cLibrary.addMember(member9); cLibrary.addMember(member10);

    ConsoleUI consoleUI = new ConsoleUI(cLibrary);

    consoleUI.run();
}