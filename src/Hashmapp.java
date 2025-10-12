
import java.util.Map;
import java.util.HashMap;
//Hashmap and hashtable are similar but the only difference is hashmap will not sycronize the data and hashtable will syncronize the data if multiple there are multilple threads are there.
public class Hashmapp {
    public static void main(String[]args)
    {
        Map<String,Integer> marks=new HashMap<>();
        marks.put("maths",89);
        marks.put("science", 90);
        marks.put("commerce",88);
        System.out.println(marks);
        System.out.println(marks.get("maths"));
        for(String key:marks.keySet())
        {
            System.out.println(key+":"+marks.get(key));
        }
        
    }
}