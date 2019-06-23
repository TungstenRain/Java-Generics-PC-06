package ch18pc06;

/**
 * 
 * @author frank
 */
public class Ch18pc06 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        Integer[] integers = {1, 5, 65, 789, -321, 215, 35};
        String[] strings={"alpha", "gamma", "delta", "epsilon", "omega"};
        
        HighestLowest<Integer> highLow1 = new HighestLowest<Integer>(integers);
        HighestLowest<String> highLow2 = new HighestLowest<String>(strings);

        System.out.println("Elements in the integers array: ");
        for(int i = 0; i < integers.length; i++) {
            System.out.println(" "+ integers[i]);
        }
        
        Integer intHigh = highLow1.highest();
        System.out.println("\n The Highest value in the integers aray: " + intHigh);

        Integer intLow = highLow1.lowest();
        System.out.println("\n The lowest value in the integers aray: " + intLow);

        System.out.print("\n Elements in the strings array: ");
        for(int i = 0; i < strings.length; i++) {
            System.out.print(" " + strings[i]);
        }
        
        String stringHigh = highLow2.highest();
        System.out.println("\n The highest value i the string array: " + stringHigh);
        
        String stringLow = highLow2.lowest();
        System.out.println("\n The lowest value i the string array: " + stringLow);
    }
}
