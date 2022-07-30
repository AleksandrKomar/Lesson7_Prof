package hometasks.task4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

public class JavaWriteXmlJaxbEx {
    private static final String BOOKSTORE_XML = "C:\\SomeDir\\bookstore.xml";

    public static void main(String[] args) throws JAXBException, ExceptionInInitializerError {

        //так как JAXB не поддерживается начиная с 11 SDK
        //попробовал рализовать через Maven
        //пытаясь повторить пример с интернета, но до конца не взлетает
        //не понимаю зпчем данное задание, если уже JAXB не поддерживается

        var bookList = new ArrayList();
        // создаем объекты книги, добавляем их в книжный магазин
        // и преобразуем книжный магазин в файл XML.
        var book1 = new Book();
        book1.setIsbn("978-0060554736");
        book1.setName("The Game");
        book1.setAuthor("Neil Strauss");
        book1.setPublisher("Harpercollins");
        bookList.add(book1);

        var book2 = new Book();
        book2.setIsbn("978-3832180577");
        book2.setName("Feuchtgebiete");
        book2.setAuthor("Charlotte Roche");
        book2.setPublisher("Dumont Buchverlag");
        bookList.add(book2);

        // Мы создаем два объекта книги.
        var bookstore = new BookStore();
        bookstore.setName("Fraport Bookstore");
        bookstore.setLocation("Livres belles");
        bookstore.setBookList(bookList);

        // Мы создаем новый JAXBContext.
        // передаем список классов, которые должен распознать новый объект контекста.
        var context = JAXBContext.newInstance(BookStore.class);
        var m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // записать System.out
        m.marshal(bookstore, System.out);
        // Из контекста получаем маршалер с помощью createMarshaller().
        // устанавливаем свойство для получения форматированного вывода.
        m.marshal(bookstore, new File(BOOKSTORE_XML));
    }
}
