package hometasks.task4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;


@XmlRootElement(namespace = "hometasks.task4")
public class BookStore {
    // XmLElementWrapper генерирует элемент-оболочку вокруг представления XML
    @XmlElementWrapper(name = "bookList")
    // XmlElement устанавливает имя
    @XmlElement(name = "book")
    private ArrayList bookList;
    private String name;
    private String location;
    public void setBookList(ArrayList bookList) {
        this.bookList = bookList;
    }
    public ArrayList getBooksList() {
        return bookList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
