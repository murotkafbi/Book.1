public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр ", "Пушкин");
        Author Chekov = new Author("Антон ", "Чехов");
        Book capitans = new Book("Капитанская дочка ", 1836, pushkin);
        Book cherryorchard = new Book("Вишневый сад ", 1903, Chekov);
        System.out.println(cherryorchard);
        System.out.println(capitans);
        capitans.setPublishingYear(1964);
    }

    public static void print(Book book) {
        System.out.println("Название книги:" +book.getTitle()+ ", год издания: " +
                book.getPublishingYear() + " ,автор: " +book.getAuthor().getName()+ " " + book.getAuthor().getSurname()) ;
    }

}
