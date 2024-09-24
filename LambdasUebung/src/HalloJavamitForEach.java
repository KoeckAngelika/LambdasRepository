import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HalloJavamitForEach {

    List<String> oldListTyp = new ArrayList<>();


    public void showList() {

        oldListTyp.add("A");
        oldListTyp.add("B");
        oldListTyp.add("C");

        for (int i = 0; i < oldListTyp.size(); i++) {
            System.out.println(oldListTyp.get(i));
        }

        oldListTyp.forEach(System.out::println);

        Arrays.asList();
    }

}
