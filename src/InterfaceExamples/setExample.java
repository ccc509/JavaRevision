package InterfaceExamples;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class setExample {

	public static void main(String[] args){
		
		Set<Integer> si = new HashSet<Integer>(); 
		
		Set<String> s=new HashSet<String>();

        s.add("b");
        s.add("a");
        s.add("d");
        s.add("c");

        Set<String> c=new TreeSet<String>();

        c.add("d");
        c.add("c");
        c.add("b");
        c.add("a");
        
        
        /*
         if(s.equals(c)){
        	System.out.println("Two sets are equal");
        }
        else{
        	System.out.println("Two sets are NOT equal");
        }
         */
        
        Iterator it=c.iterator();

        while(it.hasNext())
        {
          String value=(String)it.next();

          System.out.println("Value :"+value);
        }
    }
}
