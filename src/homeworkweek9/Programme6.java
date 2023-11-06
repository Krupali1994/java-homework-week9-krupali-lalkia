package homeworkweek9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6.Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme6 {
    //Main method
    public static void main(String[] args) {
        //Scanner Declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Index number to retrieve: ");
        int index = scanner.nextInt();
        Programme6 obj = new Programme6();
        obj.arrayList(index);
        //Scanner closing
        scanner.close();

    }

    public void arrayList(int index) {
        ArrayList<String> dayList = new ArrayList<>();
        dayList.add("Monday");
        dayList.add("Tuesday");
        dayList.add("Wednesday");
        dayList.add("Thursday");
        dayList.add("Friday");
        dayList.add("Saturday");
        dayList.add("Sunday");
        System.out.println(dayList);

        //if else
        if (index < dayList.size()) {
            System.out.println(dayList.get(index));
        } else {
            System.out.println("Invalid index");
        }
    }
}
