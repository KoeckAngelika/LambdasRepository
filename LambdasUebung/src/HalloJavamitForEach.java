import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HalloJavamitForEach {

    Consumer consumer;

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public String formatText(String text){
        return String.valueOf(consumer.format(text));
    }

}
