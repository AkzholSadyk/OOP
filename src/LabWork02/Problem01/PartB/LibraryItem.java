package LabWork02.Problem01.PartB;

public abstract class LibraryItem {

    public abstract void getInformation();

    public String title;
    public String author;
    public int publicationYear;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
