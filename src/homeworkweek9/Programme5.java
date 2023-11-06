package homeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme5 {
    // Static method
    public static void arraylist() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Black");
        arrayList.add("While");
        arrayList.add("Blue");
        arrayList.add("Red");
        arrayList.add("Yellow");

        //Iterating through iterator
        Iterator<String> iterator = arrayList.iterator();
        {
            while (iterator.hasNext()) {
                String element = iterator.next().toString();
                System.out.print(element + "," + " ");
            }
        }
    }

    //Main method
    public static void main(String[] args) {
        arraylist();
    }
}
