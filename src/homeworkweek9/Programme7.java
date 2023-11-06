package homeworkweek9;

import java.util.ArrayList;

/**
 * 7.Write a Java program to test if an array list is empty or not.
 * Define array list with underground tube name
 */
public class Programme7 {
    //Main method
    public static void main(String[] args) {
        Programme7 obj = new Programme7();
        obj.m1();
    }

    public void m1() {
        //Create array list
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Before adding any elements: ");
        //is else
        if (arrayList.isEmpty()) {
            System.out.println("The Array List is Empty");
        } else {
            System.out.println("The Array List is NOT Empty");
        }
        System.out.println();
        System.out.println("After adding the elements: ");
        arrayList.add("Tesla");
        arrayList.add("Audi");
        arrayList.add("BMW");
        arrayList.add("Merc");
        arrayList.add("Toyota");
        System.out.println(arrayList);
        System.out.println();

        //check array list is empty or not
        if (arrayList.isEmpty()) {
            System.out.println("The Array List is Empty");
        } else {
            System.out.println("The Array List is NOT Empty");
        }


    }

}
