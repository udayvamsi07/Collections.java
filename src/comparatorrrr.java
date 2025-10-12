import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorrrr {
    public static void main(String[] args) {
Comparator<Integer> com=new Comparator<Integer>()
{
public int compare(Integer i, Integer j)
{
    if(i%10>j%10)
        return 1;
    else
    return -1;
    
}
    };


        List<Integer> num=new ArrayList<>();
        num.add(12);
        num.add(41);
        num.add(67);
        num.add(33);
        Collections.sort(num,com);
    System.out.println(num);
    
    }

}
