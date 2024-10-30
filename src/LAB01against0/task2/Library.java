package LAB01against0.task2;

public class Library {
    public static int countOfBook = 0;
    public final String nameOfBook;
    public String author;
    public static int pages;
    public double price;
    public Genre genre = Genre.FANTASY;

    {
        countOfBook++;
    }

    public Library(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public Library(String nameOfBook,String author) {
        this.nameOfBook = nameOfBook;
        this.author = author;
    }

    public Library(String nameOfBook,String author,int pages) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.pages = pages;
    }

    public Library(String nameOfBook,String author,int pages,double price) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public Library(String nameOfBook,String author,int pages,double price,Genre genre) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.genre = genre;
    }

    public static int getLineOfPage() {
        int result = pages*40;
        return result;
    }


    public String toString() {
        return "Name - " + nameOfBook + ", author - " + author + ", price = " + price;
    }


}
