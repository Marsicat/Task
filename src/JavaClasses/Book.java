package JavaClasses;

public class Book {
    public int id;
    public String title;
    public String author;
    public String edition;
    public int yearOfPublication;
    public int numberOfPages;
    public double price;
    public String cover;

    public Book(int id, String title, String author, String edition, int yearOfPublication, int numberOfPages, double price, String cover) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.cover = cover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", edition='" + edition + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", cover='" + cover + '\'' +
                '}';
    }

   public static void main (String [] args) {
        Book [] books = new Book[5];
        books [0] = new Book (101,"Дневник домового", "Евгений ЧеширКо", "АСТ", 2019,384,24.05,"Твердый переплет");
        books [1] = new Book(102, "Дневник домового. Рассказы с чердака","Евгений ЧеширКо", "АСТ",2016,320, 17.4, "Твердый переплет");
        books [2] = new Book (103, "Сису. Поиск источника отваги, силы и счастья по-фински", "Катя Пантзар", "АСТ", 2018,288,25.05, "Твердый переплет");
        books [3] = new Book(104, "Чистый код. Создание, анализ и рефакторинг", "Роберт Мартин", "Питер", 2019, 464, 28.83, "Мягкая обложка");
        books [4] = new Book ( 105, "Чистая архитектура. Искусство разработки программного обеспечения", "Роберт Мартин", "Питер", 2019, 352, 35.85, "Мягкая обложка");

        String authorName = "Евгений ЧеширКо";
       System.out.println( "Книги автора " + authorName + ": ");
        for (int i =0; i< books.length;i++) {
            if (books[i].getAuthor()== authorName){
                System.out.println(books [i].getTitle() + " ");
            }

        }

       System.out.println();
       String editionName = "Питер";
       System.out.println( "Книги выпущенные издательством " + editionName + ": ");
       for (int i =0; i< books.length;i++) {
           if (books[i].getEdition()== editionName){
               System.out.println(books [i].getTitle() + " ");
           }

       }

       System.out.println();
       int yearAfter = 2017;
       System.out.println( "Книги выпущенные после " + yearAfter + ": ");
       for (int i =0; i< books.length;i++) {
           if (books[i].getYearOfPublication()> yearAfter){
               System.out.println(books [i].getTitle() + " ");
           }

       }

        }
   }

