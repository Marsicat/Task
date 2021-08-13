package JavaClasses;

public class Library {

    public Book []books;
    public Library(Book[] books) {
        this.books = books;
    }

    public void searchAuthor(String authorName) {
        System.out.printf( "Книги автора %s:%n", authorName);
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].getAuthor().length; j++) {
                if (books[i].getAuthor()[j].equalsIgnoreCase(authorName)) {
                    System.out.printf("\"%s\"%n",books[i].getTitle());
                }
            }
        }
    }

    public void searchPublishingHouseName (String publishingHouseName) {
        System.out.printf("Книги издательства %s :%n", publishingHouseName);
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPublishingHouse().equalsIgnoreCase(publishingHouseName)) {
                System.out.printf("\"%s\"%n",books[i].getTitle());
            }
        }
    }

    public void searchYearAfter (int yearAfter) {
        System.out.printf("Книги выпущенные после %s :%n", yearAfter);
        for (int i = 0; i < books.length; i++) {
            if (books[i].getYearOfPublication() > yearAfter) {
                System.out.printf("\"%s\"%n",books[i].getTitle());
            }
        }
    }

}
