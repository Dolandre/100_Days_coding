package dolandre_Febrianto;

import java.util.LinkedList;
import java.util.Queue;

public class Day16_Queue_Lingkedlist {

    public static void main(String[] args) {
        Queue<Double> dolan_Queue = new LinkedList<>();
        
        dolan_Queue.offer(2.5);
        dolan_Queue.offer(3.5);
        dolan_Queue.offer(5.5);
        dolan_Queue.offer(10.5);
        System.out.println(dolan_Queue);
        
        double a = dolan_Queue.poll();
        System.out.println("POLL : "+a);
        System.out.println(dolan_Queue);
        
        
        double b = dolan_Queue.peek();
        System.out.println("PEEK : "+b);
        System.out.println(dolan_Queue);
    }

}
