import java.util.Arrays;
import java.util.*;
public class TwinTuesday {
    public static String[] names1 = {"Matthew A", "Alexandra", "Ali", "Carson", "Derek", "Edwin", "Elle", "Harley", "Jason", "John De"};
    public static String[] names2 = {"Johnny", "Josh", "Matthew B", "Mykal", "Nadia", "Nathaniel", "Nic", "Nikho", "Ricky", "Sam"};
    public static void main(String[] args) {
        List<String> strList1 = Arrays.asList(names1);
        List<String> strList2 = Arrays.asList(names2);
        Collections.shuffle(strList1);
        Collections.shuffle(strList2);
        names1 = strList1.toArray(new String[strList1.size()]);
        names2 = strList2.toArray(new String[strList2.size()]);
        for (int i = 0; i < names1.length; i++) {
            String el1 = names1[i];
            String el2 = names2[i];
            System.out.println( el1 + " is partners with " + el2);
        }
    }
}