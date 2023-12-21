//Widest Vertical Area Between Two Points Containing No Points

import java.util.Arrays;

class HelloWorld {

    public int maxWidthOfVerticalArea(int[][] points) {
        int count = 0;
        int[] xAxis = new int[points.length];

        for (int i = 0; i < points.length; i++) {
            xAxis[i] = points[i][0];
        }

        Arrays.sort(xAxis);

        for (int i = 0; i < xAxis.length - 1; i++) {
            int diff = xAxis[i + 1] - xAxis[i];
            if (count < diff) {
                count = diff;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld(); // Create an instance of the class
        int[][] points = {{8, 7}, {9, 9}, {7, 4}, {9, 7}};
        int result = helloWorld.maxWidthOfVerticalArea(points);
        System.out.println("Max Width of Vertical Area: " + result);
    }
}
