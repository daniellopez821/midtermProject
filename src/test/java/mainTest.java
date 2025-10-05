import org.example.Main;
import org.example.myList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class mainTest {

    Main m = new Main();
    ArrayList<myList> list = new ArrayList <myList>();

    @BeforeEach
    void setUp() {
        String name = "laundry";
        list.add(new myList(name));
    }

    @Test
    void addItemTest() {
        String name = "dishes";
        m.addToDo(name);
    }
    @Test
    void deleteItemTest() {
        String name = "laundry";
        m.deleteFromDo(name);
    }
    @Test
    void displayItemTest() {
        m.displayAll();
    }
}
