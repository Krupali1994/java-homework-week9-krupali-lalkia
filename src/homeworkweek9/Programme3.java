package homeworkweek9;

// 3.Write a Java program to reverse an array of integer values
public class Programme3 {
    //Static method for reverse array
    public static int[] reverse(int[] array) {
        int length = array.length;
        int[] reverseArray = new int[length];

        for (int i = 0; i < length; i++) {
            reverseArray[i] = array[length - 1 - i];
        }
        return reverseArray;
    }

    //Static method for print array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    //Main method
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.print("Original Array: ");
        printArray(originalArray);
        System.out.println(" ");
        int[] reversesArray = reverse(originalArray);
        System.out.print("Reversed Array: ");
        printArray(reversesArray);
    }
}
