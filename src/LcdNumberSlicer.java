import java.util.ArrayList;
import java.util.List;

public class LcdNumberSlicer {
    public List<String[]> sliceNumber(String input) {
        String[] numbers = input.split("-S");

        List<String[]> sliceResult = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!numbers[i].equals("")) {
                String[] everyNumber = numbers[i].split("\\s+");
                sliceResult.add(removeEmptyStr(everyNumber));
            }
        }
        return sliceResult;
    }

    private String[] removeEmptyStr(String[] numbers) {
        List<String> result = new ArrayList();
        for (int i = 0; i < numbers.length; i++) {
            if (!numbers[i].equals("")) {
                result.add(numbers[i]);
            }
        }
        return result.toArray(new String[0]);
    }

}
