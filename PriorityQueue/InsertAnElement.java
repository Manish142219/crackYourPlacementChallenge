import java.util.*;



public class InsertAnElement {

    // making a Heap using the arrauylist
    ArrayList<Integer> arr = new ArrayList<>();
    
    // writing a function for inserting a value in the array list 
    public void add(int data) {
        // add data at the last of the arrrayList 
        arr.add(data);

        // now we have to fix the heap
        int x = arr.size() - 1; // child index
        int par = (x - 1) / 2; // parent index

        while (arr.get(x) < arr.get(par)) {
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);
        }

    }

    // Getting the minimum element
    public int peek() {
        return arr.get(0);
    }
}

