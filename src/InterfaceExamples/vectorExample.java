package InterfaceExamples;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class vectorExample {

    public static void main(String[] args) {

        // List Example implement with ArrayList
        List<String> ls=new ArrayList<String>();

        ls.add("one");
        ls.add("Three");
        ls.add("two");
        ls.add("four");

        List<Integer> li = new ArrayList<Integer>();
        li.add(4);
        li.add(3);
        li.add(4);
        li.add(6);
        li.add(1);
        
        li.add(3, 100);
        
        for(int i=0;i<li.size();i++){
        	System.out.println("The element at position "+i+" is: "+li.get(i));
        }

        li.remove(3);
        System.out.println("After removing");
        
        for(int i=0;i<li.size();i++){
        	System.out.println("The element at position "+i+" is: "+li.get(i));
        }
        
        /*
        Iterator it=li.iterator();

        while(it.hasNext())
        {
          int value=(Integer) it.next();

          System.out.println("Value :"+value);
        }
        */
    }
}
