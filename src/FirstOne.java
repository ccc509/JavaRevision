import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;;


public class FirstOne {

	public static void main(String[] args){
		System.out.println("Hello world");
		
		Set<String> s=new HashSet<String>();

        s.add("b");
        s.add("a");
        s.add("d");
        s.add("c");

        Iterator it=s.iterator();

        while(it.hasNext())
        {
          String value=(String)it.next();

          System.out.println("Value :"+value);
        }
    }
	
}
