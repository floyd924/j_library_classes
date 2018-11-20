import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> inventory;

    public Library(String name){
        this.name = name;
        this.inventory = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public int countBooks(){
        return this.inventory.size();
    }

    public void addBook(Book batman) {
        this.inventory.add(batman);
    }
}
