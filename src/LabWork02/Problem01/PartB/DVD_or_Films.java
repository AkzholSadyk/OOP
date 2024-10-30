package LabWork02.Problem01.PartB;

public class DVD_or_Films extends LibraryItem{
    private double Rating;
    public DVD_or_Films(String title, String author, int publicationYear, double rating) {
        super(title, author, publicationYear);
        this.Rating = rating;
    }

    public void getInformation() {
        System.out.println("Information about the film: title <" + title + "> author: " + author + " and the publication year: " + publicationYear + " and this film has " + Rating + " rating");
    }
}
