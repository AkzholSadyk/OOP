package LabWork02.Problem01.PartB;

public class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int publicationYear, int pages) {
        super(title, author, publicationYear);
        this.numberOfPages = pages;
    }

    @Override
    public void getInformation() {
        System.out.println("Information about the book: title <" + title + "> author: " + author + " and the publication year: " + publicationYear + " and this book has " + numberOfPages + " pages");
    }
}
