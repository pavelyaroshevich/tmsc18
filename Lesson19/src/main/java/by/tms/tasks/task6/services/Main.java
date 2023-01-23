package by.tms.tasks.task6.services;

import by.tms.tasks.task6.models.Book;
import by.tms.tasks.task6.models.EmailAddress;
import by.tms.tasks.task6.models.Library;
import by.tms.tasks.task6.models.Reader;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.getBooks().add(new Book("Лев Толстой", "Война и мир", 1891));
        library.getBooks().add(new Book("Мирный", "Привет", 1985));
        library.getBooks().add(new Book("Златан Ибрагимович", "Я - Златан", 2013));
        library.getBooks().add(new Book("Пеле", "Легендарный Пеле", 2015));
        library.getBooks().add(new Book("Пушкин", "Дубровский", 1841));

//      Получить список всех книг библиотеки, отсортированных по году издания.
        library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getYearOfIssue))
                .map(Book::toString)
                .forEach(System.out::println);

//      Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
//      При этом флаг согласия на рассылку учитывать не будем: библиотека закрывается, так что хотим оповестить всех.
        List<EmailAddress> emailAddressList = library.getReaders().stream()
                .map(Reader::getEmailAddress)
                .map(EmailAddress::new)
                .toList();

//      Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей, которые согласились на рассылку.
//      Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
        List<EmailAddress> subscriberList = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .filter(reader -> reader.getBookList().size() > 1)
                .map(Reader::getEmailAddress)
                .map(EmailAddress::new)
                .toList();

//      Получить список всех книг, взятых читателями.
//      Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).
        List<Book> books = library.getReaders().stream()
                .flatMap(reader -> reader.getBookList().stream())
                .distinct()
                .toList();

//      Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Пушкина Александра Сергеевича.
        boolean match = library.getReaders().stream()
                .flatMap(reader -> reader.getBookList().stream())
                .distinct()
                .anyMatch(book -> "Пушкин".equals(book.getAuthor()));
    }
}
