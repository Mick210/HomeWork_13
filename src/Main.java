public class Main {
    public static void main(String[] args) {
        Author tolstoi = new Author("Лев Николаевич", "Толстой");
        Author pushkin = new Author("Александр Сергеевич", "Пушкин");

        Book warAndPeace = new Book("Война и Мир", tolstoi, 1866);
        Book poltava = new Book("Полтава", pushkin, 1828);

        printBook(warAndPeace);
        printBook(poltava);


        if (warAndPeace.equals(poltava)) {
            System.out.println(warAndPeace.hashCode() + " & " + poltava.hashCode());
        } else {
            System.out.println("False");
        }
    }

    private static void printBook(Book book) {
        System.out.println(book.toString());
    }
}