package ch18pc06;

/**
 * 
 * @author frank
 */
public class HighestLowest <T extends Comparable<T>>{
    T[] myArray;
    
    // Constructor
    public HighestLowest(T[] anArray) {
        myArray = anArray;
    }
    
    public T highest() {
        T high = myArray[0];
        for(int i=1;i<myArray.length;i++) {
            if(high.compareTo(myArray[i]) < 0) {
                high = myArray[i];
            }
        }
        return high;
}

    public T lowest() {
        T low = myArray[0];
        for(int i=1;i<myArray.length;i++) {
            if(low.compareTo(myArray[i]) > 0) {
                low = myArray[i];
            }
        }
        return low;
    }

}
