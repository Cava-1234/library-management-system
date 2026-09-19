public  class Book {

    final String authorName;
    final String title;
    final String numberISBN;
    final int iD;

    public Book(String authorName, String title, String numberISBN, int iD) {
        this.authorName = authorName;
        this.title = title;
        this.numberISBN = numberISBN;
        this.iD = iD;
    }

    public String toString() {
        return String.format(""" 
                Author: %s
                Title: %s
                ISBN: %s
                ID: (%s)
                """, authorName, title, numberISBN, iD);
    }

    public int getId() {
        return iD;
    }
}