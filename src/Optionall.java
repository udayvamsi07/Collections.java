import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optionall {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("uday","vamsi","Pitta","batman");
    //    Optional<String> str=names.stream()
    //           .filter(st ->st.contains("n"))
    //           .findFirst();

    //     System.out.println(str.orElse("not found"));

//or we can use this way
String str=names.stream()
              .filter(st ->st.contains("n"))
              .findFirst()
              .orElse("not found");

        System.out.println(str);
    }

}
