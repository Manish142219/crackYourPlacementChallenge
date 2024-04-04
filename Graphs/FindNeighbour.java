package Graph;

import java.util.ArrayList;

public class Classroom_01 {
    // we are making a graph

    // we are storing the information of the edge
    static class Edge {
        int src; // this is the source
        int des; // this is the destination
        int wt; // this is the weight

        // now we are making a constructor
        public Edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.wt = w;
        }

    }

    public static void main(String[] args) {
        /*
         * (5)
         * 0----1
         * / \
         * (1) / \ (3)
         * / \
         * 2-------3
         * | (1)
         * (2)|
         * |
         * 4
         */

        // the number of the vertises are
        int v = 5;

        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            // this is made yto store the values to the current destination and weight to a
            // seperate arrayList
            graph[i] = new ArrayList<>();
        }

        // information of all the edges start from 0 are stored here
        graph[0].add(new Edge(0, 1, 5));

        // 1 - vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 -- vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3-- vertex
        graph[3].add(new Edge(3, 1, 35));
        graph[1].add(new Edge(3, 2, 1));

        // 4 -- vertex
        graph[4].add(new Edge(4, 2, 2));

        // now if we want to print the 2's vertex neighbours
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i); // it takes the value of the source - destination and the weight
            System.out.print(e.des + " ");
        }

    }

}
