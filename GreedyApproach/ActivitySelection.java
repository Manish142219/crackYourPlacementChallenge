
import java.util.*;
public class ActivitySelection{
    public static void main(String agrs[]) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        // we are assuming that the end array is already sorted

        ArrayList<Integer> ans = new ArrayList<>(); // making a dynamic array for storing the answer
        int activityCount = 0;

        //if end array is sorted it means that we always choose the first activity 
        activityCount++;
        ans.add(0); // adding the index of first pair 
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (lastEnd <= start[i]) {
                activityCount++;
                ans.add(i);
                lastEnd = end[i];

            }

        }
        
        // now the maximum activity is 
        System.out.println("The Maximum Activity count is : "+ activityCount);

        // now we are printing the elements of the arrray list
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
