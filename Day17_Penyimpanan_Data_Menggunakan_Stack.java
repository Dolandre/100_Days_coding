package dolandre_Febrianto;

import java.util.Stack;

public class Day17_Penyimpanan_Data_Menggunakan_Stack {
    public static void main (String[] args) {
        Stack <Double> myStack = new Stack<> ();
        myStack.push(2.5);
        System.out.println(myStack);
        
        myStack.push(1.4);
        myStack.push(4.6);
        myStack.push(6.8);
        myStack.push(2.4);
        System.out.println(myStack);
        
        double value = myStack.pop();
        System.out.println("POP :"+value);
        System.out.println(myStack);
    }
    
}
