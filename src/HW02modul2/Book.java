package HW02modul2;

public class Book {
    String title;
    int year;
    String author;
    int pages;
    double reviewRate;


    void displayInfo() {
        System.out.println("Title of the book: " + title);
        System.out.println("Published year: " + year);
        System.out.println("Author of the book: " + author);
        System.out.println("Amount of pages: " + pages);
    }

    void reviewed() {
        if (reviewRate < 4)
            System.out.println("Google review rate: " + reviewRate);
        else
            System.out.println("Excellent google review rate! " + reviewRate);
    }

    void percentageBookRead(int pagesRead) {
        int percentagePages;
        if (pagesRead == pages) {
            System.out.println("You have finished the book completely 100%");
        } else {
            percentagePages = (int) Math.round(pagesRead * 100 / (double) pages);
            System.out.println("You have read " + percentagePages + "%");
        }
        System.out.println();
    }
}

class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "War and Peace";
        book1.year = 1867;
        book1.author = "Leo Tolstoi";
        book1.pages = 1225;
        book1.reviewRate = 4.5;
        book1.displayInfo();
        book1.reviewed();
        book1.percentageBookRead(120);

        Book book2 = new Book();
        book2.title = "Pride and Prejudice";
        book2.year = 1813;
        book2.author = "Jane Austen";
        book2.pages = 432;
        book2.reviewRate = 4.7;
        book2.displayInfo();
        book2.reviewed();
        book2.percentageBookRead(432);

        Book book3 = new Book();
        book3.title = "Divine Comedy";
        book3.year = 1321;
        book3.author = "Dante Alighieri";
        book3.pages = 712;
        book3.reviewRate = 4.5;
        book3.displayInfo();
        book3.reviewed();
        book3.percentageBookRead(450);

    }
}
