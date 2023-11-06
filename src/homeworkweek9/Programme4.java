package homeworkweek9;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme4 {
    //Main method
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Black");
        colours.add("White");
        colours.add("Blue");
        colours.add("Red");
        colours.add("Yellow");

        //for each loop
        System.out.println("Colours in the Array List is: ");
        for (String list : colours) {
            System.out.println(list);
        }
    }
}
