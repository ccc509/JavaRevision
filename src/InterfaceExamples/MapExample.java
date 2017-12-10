package InterfaceExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        Map<Object,String> mp=new HashMap<Object, String>();
        
        Map<Integer,String> mp2 = new HashMap<Integer,String>();

        mp2.put(1, "Hello");
        mp2.put(2, "Sissi");
        mp2.put(3, "Vivian");
        mp2.put(4, "Wenjing");
        mp2.put(5, "Laya");
        
        System.out.println("The 3rd element is: "+mp2.get(3));
        
        /*
        
        // adding or set elements in Map by put method key and value pair
        mp.put(new Integer(2), "Two");
        mp.put(new Integer(1), "One");
        mp.put(new Integer(3), "Three");
        mp.put(new Integer(4), "Four");

		*/
        
        /*
        
        //Get Map in Set interface to get key and value
        Set s=mp.entrySet();

        //Move next key and value of Map by iterator
        Iterator it=s.iterator();

        while(it.hasNext())
        {
            // key=value separator this by Map.Entry to get key and value
            Map.Entry m =(Map.Entry)it.next();

            // getKey is used to get key of Map
            int key=(Integer)m.getKey();

            // getValue is used to get value of key in Map
            String value=(String)m.getValue();

            System.out.println("Key :"+key+"  Value :"+value);
        }
        */
    }
}