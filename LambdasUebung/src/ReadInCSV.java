import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadInCSV {

    public int number;
    public int placeholder;

    public Map<Integer, List<String>> readCsv()
    {

        Map<Integer, List<String>> listMap = new HashMap<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("numbers"));
            String line = bufferedReader.readLine();
            int countTheLine = 0;
            int keyNumber = 1;
            int keyCounterNumber = 0;

            while (line != null) {
                if (keyCounterNumber != keyNumber) {
                    String readyLine = desirealize(line);
                    if (countTheLine == 0) {
                        keyNumber = Integer.parseInt(readyLine);
                        List<String> NewnumberList = new ArrayList<>();
                        listMap.put(keyNumber, NewnumberList);
                        countTheLine++;
                        line = bufferedReader.readLine();
                    } else {
                        List<String> numberList = listMap.get(keyNumber);
                        numberList.add(readyLine);
                        line = bufferedReader.readLine();
                        keyCounterNumber++;
                    }
                }else
                {
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listMap;
    }

    
}
