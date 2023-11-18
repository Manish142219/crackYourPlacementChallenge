import java.util.*;

public class MaxChain {

    // we have given n number of pairs we have to make a chain by these numbers
    // and there is a condition when the next pair first element is greater then the first pair's last element

    public static void main(String[] args) {
        int[][] pairs = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // now we are sorting these pairs
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int lastSelected = pairs[0][1];
        int MaxChain = 1;

        for (int i = 1; i < pairs.length; i++) {
            if (lastSelected < pairs[i][0]) {
                MaxChain++;
                lastSelected = pairs[i][1];
                
            }
        }

        System.out.println(MaxChain);

    }
    
}
