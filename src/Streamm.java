

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
//Each stream(s1,s2,s3) can only be used once and if we use twice we will get an error
public class Streamm {
    public static void main(String[] args) {
        List<Integer> ll=new ArrayList<>();
        ll.add(7);
        ll.add(34);
        ll.add(44);
        ll.add(65);
Stream<Integer> s1=ll.stream();
Stream<Integer> s2=s1.filter(n ->n%2==0);
Stream<Integer> s3=s2.map(n ->n*2);
int res =s3.reduce(0,(c,e) -> c+e);
System.out.println(res);
//s3.forEach(n ->System.out.println(n));


        
    }
    
}
