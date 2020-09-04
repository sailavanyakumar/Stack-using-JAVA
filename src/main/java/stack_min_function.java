
import java.util.Stack;


public class stack_min_function extends Stack<Integer> {
  
 Stack<Integer> s2;
 public stack_min_function() {
 s2 = new Stack<Integer>();
 }

 public void push(int value){
 if (value <= min()) {
 s2.push(value);
 }
 super.push(value);
 }

 public Integer pop() {
 int value = super.pop();
 if (value == min()) {
 s2.pop();
 }
 return value;
 }
 public int min() {
 if (s2.isEmpty()) {
 return Integer.MAX_VALUE;
 } else {
 return s2.peek();
 }
 }
 
 public static void main(String[] args)
 {
     stack_min_function s= new stack_min_function();
     s.push(23);
     s.push(14);
     s.push(50);
     s.push(12);
     
     Integer k= s.pop();
     
     System.out.println("Popped element is.\t "+k);
     int min=s.min();
     
     System.out.println("Minimum element of stack is..+ \t"+min);
     
     
     
             
 }
    }
    
    


