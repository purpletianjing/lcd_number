import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please input size and numbers, like: -S 2 01");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LcdNumberSlicer lcdNumberSlicer = new LcdNumberSlicer();
        List<String[]> result = lcdNumberSlicer.sliceNumber(input);

        LcdNumberPrinter ledNumberPrinter = new LcdNumberPrinter();
        result.forEach(numberArr -> {
            ledNumberPrinter.printNumber(Integer.parseInt(numberArr[0]),
                numberArr[1]);
        });
    }
}
