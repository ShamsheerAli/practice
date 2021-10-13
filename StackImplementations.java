package practice;

import java.util.Stack;

public class StackImplementations {

	public static void main(String[] args) {
       Stack<String> intruments=new Stack<String>();
           intruments.add("Guiter");
           intruments.add("Drums");
           intruments.add("Flute");
           System.out.println(intruments);
           System.out.println(intruments.pop());    //THe last element you entered will be popped out(LIFO)
           System.out.println(intruments);
           System.out.println(intruments.peek());   //Shows The Last Element U Entered
           System.out.println(intruments.empty());
           System.out.println(intruments.capacity());
           System.out.println(intruments.contains("Guiter"));
           System.out.println(intruments.firstElement());
           System.out.println(intruments.get(1));
           System.out.println(intruments.push("Piano"));
           System.out.println(intruments.size());
           System.out.println(intruments);
           for(int i=0; i<intruments.size(); i++) {
        	   System.out.println(intruments.get(i));
           }
	}

}
