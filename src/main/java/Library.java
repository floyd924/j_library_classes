import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> inventory;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.inventory = new ArrayList<Book>();

    }

    public String getName() {
        return name;
    }

    public int countBooks(){
        return this.inventory.size();
    }

    public void addBook(Book batman) {
        if (this.inventory.size() < this.capacity) {
            this.inventory.add(batman);
        }
    }

    public int getCapacity() {
        return capacity;
    }
}
