public class Main {
    public static void main(String[] args) {
        Author tolstoi = new Author("Лев Николаевич", "Толстой");
        Author pushkin = new Author("Александр Сергеевич", "Пушкин");

        Book warAndPeace = new Book("Война и Мир", tolstoi, 1866);
        Book poltava = new Book("Полтава", pushkin, 1828);

        printBook(warAndPeace);
        printBook(poltava);

        warAndPeace.setPublishingYear(1867);

        printBook(warAndPeace);
    }

    private static void printBook(Book book) {
        System.out.println(book.getAuthor().getFirstName() + " " + book.getAuthor().getSecondName() + " - " + book.getTitle() + " - " + book.getPublishingYear() + " год");
    }
}