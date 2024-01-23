public class PowerOf {

    // here we are calculating the power of a number!

    // public static int calculate(int n, int pow){
    //     if(pow == 0 ){
    //         return 1;
    //     }
    //     return n * calculate(n, pow-1);
    // }

    // optimized approach
    public static int calculate(int n , int pow){
        if(pow == 0 ){
            return 1;
        }
        if(pow % 2 == 0){
            //means power is odd
            return calculate(n, pow/2)*calculate(n,pow/2);
        }
        else{
            //power is odd
            return n * calculate(n, pow/2)*calculate(n,pow/2);
        }
    }

    
    public static void main(String[] args) {
        int n = 2;
        int pow = 10;
        System.out.println(calculate(n, pow));
    }
    
}
