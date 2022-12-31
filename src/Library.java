import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private final String name;
    private final String address;
    private final int totalBookCapacity;
    private List<Book> bookList = new ArrayList<>();

    public Library(String name, String address, int number, List<Book> books) {

        this.name = name;
        this.address = address;
        this.totalBookCapacity = number;
        this.bookList = books;
    }

    public String getName() {

        return name;
    }

    public String getAddress() {

        return address;
    }

    private int getTotalBookCapacity() {

        return totalBookCapacity;
    }

    private List<Book> getBookList() {

        // to add return value of all books once Book class has knowledge how to do that
    }

}
