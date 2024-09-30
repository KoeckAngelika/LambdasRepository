import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberTester {

    public int oddTester;
    public int primeTester;
    public int palindromeTester;

    Map<Integer, List<String>> listMap = new HashMap<>();

    public Map<Integer, List<String>> getListMap() {
        ReadInCSV readInCSV = new ReadInCSV();
        listMap = readInCSV.readCsv();
        return listMap;
    }

    public NumberTester (String fileName ) {
        //TODO
    }

    public NumberTester() {

    }


    public void testFile ( ) {



    }



}
