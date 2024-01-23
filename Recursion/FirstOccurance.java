public class FirstOccurance {

    // First Occurance of a number in a Array

    public static int indexOf(int arr[], int val,int i ){
        if(arr[i] == val){
            return i;
        }
        return indexOf(arr, val, ++i);
    }
    public static void main(String[] args) {
        int[] arr = { 8,3,5,7,3,5,1,8,0};
        System.out.println(indexOf(arr, 5, 0));

    }
}
