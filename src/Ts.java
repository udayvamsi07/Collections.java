import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

   
public class Ts {
    public static void main(String[]args)
    {
        Set<Integer> n=new TreeSet<>();
        n.add(21);
        n.add(1);
        n.add(24);
        n.add(36);
        n.add(3);
        Iterator<Integer> values=n.iterator();
        while(values.hasNext())
        {
            System.out.println(values.next());
        }

    }

}



