import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Created by User on 09.03.2017.
 */
public class Task {
    public static void main(String[] args) {
        Object max = 0;
        int min = 0;
        int[] array = new int[]{-1, 2, 8, 1, 7, 3, -2, 9};

        Set<Integer> sortedArray = new TreeSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            sortedArray.add(array[i]);
        }

        Iterator x = sortedArray.iterator();
        if (x.hasNext()) {
            for (Integer i : sortedArray) {
                max = x.next();
            }
        }

        for(Integer i : sortedArray){
            String s = max.toString();
            int z = parseInt(s);
            if(i < z){
                min=i;
            }
        }
    }
}

