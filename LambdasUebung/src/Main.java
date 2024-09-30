import java.util.*;

public class Main {
        
    public static void main(String[] args) {

        project1();
        //project2();
        //project3();
    }


    public static void project1()
    {
        HalloJavamitForEach halloJavamitForEach = new HalloJavamitForEach();
        List<String> oldListTyp = new ArrayList<>();
        oldListTyp.add("A");
        oldListTyp.add("B");
        oldListTyp.add("C");

        for (int i = 0; i < oldListTyp.size(); i++) {
            System.out.println(oldListTyp.get(i));
        }

        oldListTyp.forEach(System.out::println);

        for (String string : oldListTyp) {
            Consumer ask = text -> string + "?";
            halloJavamitForEach.setConsumer(ask);
            halloJavamitForEach.formatText(string);
        }
    }


}
