package programme1_calculate;

import java.util.Scanner;

public class Main extends Calculate {
    // Main method
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();
        String result;


        //do while loop
        do {

            System.out.println("Enter first number: ");
            int a = scanner.nextInt();
            System.out.println("Enter second number: ");
            int b = scanner.nextInt();
            System.out.println("Enter the symbol: +, -, * ,/ ");
            char symbol = scanner.next().charAt(0);
            obj.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation please enter yes for 'y' or no for 'n': ");
            result = scanner.next().toLowerCase();
        }
        while (result.startsWith("y"));

        //Closing scanner
        scanner.close();
    }
}



