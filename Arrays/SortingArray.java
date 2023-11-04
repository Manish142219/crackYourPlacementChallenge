

import java.util.*;

//Sorting the Array in the Accending and Decending Order

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(11);
        list.add(422);
        list.add(12);

        System.out.println("Before :" + list);

        Collections.sort(list);
        System.out.println("After shorting :" + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse order :"+list);


    }

}
