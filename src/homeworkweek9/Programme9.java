package homeworkweek9;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme9 {
    //main method
    public static void main(String[] args) {
        hashMap();
    }

    //static method
    public static void hashMap() {
        Map<Integer, String> people = new HashMap<>();
        people.put(1, " John");
        people.put(2, " Mike");
        people.put(3, " Ella");
        people.put(4, " Lisa");
        people.put(5, " Sam");
        people.put(6, " Emily");
        people.put(7, " David");
        for (Map.Entry<Integer, String> name : people.entrySet()) {
            System.out.println(name);
        }
    }
}
