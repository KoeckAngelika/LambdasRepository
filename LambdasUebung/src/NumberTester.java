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

    public void setOddEvenTester (int oddTester ) {
        this.oddTester = oddTester ;
    }

    Calculator isEven = (number -> oddTester % 2);

    public int even(int oddTester) {

        int evenNumber =  isEven.calculate(oddTester);
        if (evenNumber % 2== 0)
        {
            return oddTester;
        }else
        {
            return 0;
        }
    }





    Calculator isPrime = (number -> primeTester);

    public int ceiling = 100001;
    Boolean[] ceilingList = new Boolean[ceiling];

    public boolean prime(int primeTester) {

        int evenNumber =  isPrime.calculate(primeTester);

        isPrimeCheck();

        if (ceilingList[evenNumber]) {
            return true;
        }
        return false;
    }

    public void isPrimeCheck()
    {
        for (int i = 1; i < ceiling; i++) {
            ceilingList[i] = true;
        }

        for (int i = 2; i < Math.sqrt(ceilingList.length); i++) {
            if (ceilingList[i]) {
                int deleatIndex = i * i;
                while (deleatIndex < ceiling) {
                    ceilingList[deleatIndex] = false;
                    deleatIndex = deleatIndex + i;
                }
            }
        }
    }

    public void setPrimeTester (int primeTester ) {
        this.primeTester = primeTester ;
    }










    public void testFile ( ) {



    }



}
