import javax.swing.border.TitledBorder;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title title) {
        this.titles.add(title);
    }

    double calculateRoyalties() {
        double sum = 0;
        for (Title title : titles) {
            sum += title.calculateRoyalty();
        }
        return sum;
    }

    public String getName() {
        return name;
    }
}
