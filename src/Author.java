import javax.swing.border.TitledBorder;
import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }
    public void addTitle(Title title){

    }
    double calculateRoyalties(){

    }

    public String getName() {
        return name;
    }
}
