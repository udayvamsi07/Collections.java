import java.util.Set;
import java.util.HashSet;
public class S {
    public static void main(String[]args)
    {
        Set<Integer> n=new HashSet<>();
        n.add(21);
        n.add(1);
        n.add(24);
        n.add(36);
        n.add(2);
        n.add(3);
        for(int a:n)
        {
            System.out.println(a);
        }

    }

}
