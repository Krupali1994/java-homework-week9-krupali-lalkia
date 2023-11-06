package homeworkweek9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 */
public class Programme10 {
    //Main method
    public static void main(String[] args) {
        // Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter tube station name of Zone 1: ");
        String stationName = scanner.nextLine();
        Programme10 obj = new Programme10();
        obj.stationList(stationName);
        //closing scanner
        scanner.close();
    }

    public void stationList(String statiionNAme) {
        ArrayList<String> stationList = new ArrayList<>();
        stationList.add("Bond Street");
        stationList.add("Baker Street");
        stationList.add("London Bridge");
        stationList.add("Oxford Circus");
        stationList.add("Holborn");
        stationList.add("Green Park");
        stationList.add("Westminster");
        stationList.add("Victoria");

        //Hashmap created for map station line to line
        Map<String, String> tubeLine = new HashMap<>();
        tubeLine.put("Bond Street", "Jubilee, Central");
        tubeLine.put("Baker Street", "Jubilee, Circle, Metropolitan, Hammersmith & City");
        tubeLine.put("London Bridge", "Jubilee, Northern");
        tubeLine.put("Oxford Circus", "Victoria, Central, Bakerloo");
        tubeLine.put("Holborn", "Piccadilly, Central");
        tubeLine.put("Green Park", "Jubilee, Piccadilly, Victoria");
        tubeLine.put("Westminster", "Jubilee, Circle, District");
        tubeLine.put("Victoria", "Circle, District, Victoria");

        //if else
        if (stationList.contains(statiionNAme)) {
            String line = tubeLine.get(statiionNAme);
            System.out.println("Lines passing through " + statiionNAme + " : " + line);
        } else {
            System.out.println(statiionNAme + " station is NOT in Zone 1");
        }
    }
}
