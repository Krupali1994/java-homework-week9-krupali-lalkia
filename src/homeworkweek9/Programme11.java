package homeworkweek9;

import java.util.ArrayList;

/**
 * 11.	Declare following two arraylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1
 * .add("Red");
 * c1
 * .add("Green");
 * c1
 * .add("Black");
 * c1
 * .add("White");
 * c1
 * .add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2
 * .add("Red");
 * c2
 * .add("Green");
 * c2
 * .add("Black");
 * c2
 * .add("Pink");
 */
public class Programme11 {
    //Main method
    public static void main(String[] args) {
        compareArrayList();
    }

    //Static method
    public static void compareArrayList() {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");


        //if else
        if (c1.equals(c2)) {
            System.out.println("The ArrayList c1 and c2 are equal");
        } else {
            System.out.println("The ArrayList c1 and c2 are NOT equal");
        }
    }
}
