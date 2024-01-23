public class PowerOf {

    // here we are calculating the power of a number!

    public static int calculate(int n, int pow){
        if(pow == 0 ){
            return 1;
        }
        return n * calculate(n, pow-1);
    }
    public static void main(String[] args) {
        int n = 2;
        int pow = 10;
        System.out.println(calculate(n, pow));
    }
    
}
