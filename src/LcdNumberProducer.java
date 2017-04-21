import java.util.ArrayList;
import java.util.List;

public class LcdNumberProducer {

    public List<StringBuffer[]> produceOriginalNumber(String numberStr) {
        LcdNumberLoader lcdNumberLoader = new LcdNumberLoader();
        List<StringBuffer[]> numberList = lcdNumberLoader.loadNumbers();

        List<StringBuffer[]> result = new ArrayList<>();

        char[] numbers = numberStr.toCharArray();

        for (char number : numbers) {
            result.add(numberList.get(Integer.parseInt(String.valueOf(number))));
        }

        return result;
    }
}
