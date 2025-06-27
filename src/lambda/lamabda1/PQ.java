package lambda.lamabda1;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 작성자  : lbs
 * 날짜    : 2025-06-27
 * 풀이방법
 **/


public class PQ {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq  = new PriorityQueue<>
                ((a,b)-> {return Integer.compare(a,b);});
    }
}
