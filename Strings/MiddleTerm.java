package college;

import java.util.*;

// Printing the middle in the String

public class Stringgg {

    public static int countv(String st) {
        int i = 0;
        int count = 0;
        while (st.length() > 0) {

            if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o'
                    || st.charAt(i) == 'u') {

                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        String st = "295174";
        int mid = (st.length() - 1) / 2;
        if ((st.length() - 1) % 2 == 0) { // this is even

            System.out.println("the middle term are : " + st.charAt(mid));

        } else // odd
            System.out.println("the middle terms are : " + st.charAt(mid) + " " + st.charAt(mid + 1));

    }

}
