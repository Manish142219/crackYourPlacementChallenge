import java.util.*;

public class FractionalKnapsack {

    // givemn the weight of and the value of the N items , put the items 
    //in a knapsack of capicity W to get the maximum total value in the knapsack    


    public static void main(String[] args) {
        int[] value = { 60, 100, 120 }; // the max values
        int[] weight = { 10, 20, 30 };
        int W = 50; // maximum capacity of knapsack 

        double ratio[][] = new double[value.length][2];

        //stoting 0th col => original index || 1st column store => ratio
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i; // original Index
            ratio[i][1] = (double) value[i] / weight[i]; // storing the ratio
        }
        
        //sorting the array in tha assending Order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;  // capacity of knapsack
        int finalVal = 0;  

        // arrang in the desending order 
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) { //check if the knapsack is able to hold the weight or not
                finalVal += value[idx]; // greater value is stored 
                capacity -= weight[idx]; // knapSack capacity decreases
            } else {
                // including the fractional values
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }

        }
        System.out.println("Final vaalue = "+ finalVal);

    }
}
