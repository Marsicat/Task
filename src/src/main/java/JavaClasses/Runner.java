package JavaClasses;


public class Runner {
    public static void main(String[] args) {

        Book[] books = new Book[6];
        books[0] = new Book(101, "Дневник домового", new String[]{"Евгений ЧеширКо"}, "АСТ", 2019, 384, 24.05, "Твердый переплет");
        books[1] = new Book(102, "Дневник домового. Рассказы с чердака", new String[]{"Евгений ЧеширКо"}, "АСТ", 2016, 320, 17.4, "Твердый переплет");
        books[2] = new Book(103, "Сису. Поиск источника отваги, силы и счастья по-фински", new String[]{"Катя Пантзар"}, "АСТ", 2018, 288, 25.05, "Твердый переплет");
        books[3] = new Book(104, "Чистый код. Создание, анализ и рефакторинг", new String[]{"Роберт Мартин"}, "Питер", 2019, 464, 28.83, "Мягкая обложка");
        books[4] = new Book(105, "Чистая архитектура. Искусство разработки программного обеспечения", new String[]{"Роберт Мартин"}, "Питер", 2019, 352, 35.85, "Мягкая обложка");
        books[5] = new Book(106, "Рассказы о природе", new String[]{"Виталий Бианки", "Михаил Пришвин", "Николай Сладков"}, "РОСМЭН", 2018, 128, 5.04, "Твердый переплет");

        Library library = new Library(books);
        String authorName = "Николай Сладков";
        String publishingHouseName = "аст";
        int yearAfter = 2018;
        library.searchAuthor(authorName);
        library.searchPublishingHouseName(publishingHouseName);
        library.searchYearAfter(yearAfter);

    }
}
