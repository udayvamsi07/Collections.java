import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class comparatorr {
 public static void main(String[] args) {
    Comparator<Integer> com=new Comparator<Integer>()
    {
        public int compare(Integer i, Integer j)
        {
if(i%10>j%10)
{
    return 1;

}
else
{
    return -1;
}
        }

    }; 
   
        List<Integer> nums=new ArrayList<>();
        nums.add(20);
        nums.add(39);
        nums.add(67);
        nums.add(53);
       
        Collections.sort(nums,com);
         System.out.println(nums);

    }

}
