import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LcdNumberLoader {
    public List<StringBuffer[]> loadNumbers() {
        StringBuffer[] num0 = {
            new StringBuffer(" - "),
            new StringBuffer("| |"),
            new StringBuffer("   "),
            new StringBuffer("| |"),
            new StringBuffer(" - ")};
        StringBuffer[] num1 = {
            new StringBuffer("   "),
            new StringBuffer("  |"),
            new StringBuffer("   "),
            new StringBuffer("  |"),
            new StringBuffer("   ")};
        StringBuffer[] num2 = {
            new StringBuffer(" - "),
            new StringBuffer("  |"),
            new StringBuffer(" - "),
            new StringBuffer("|  "),
            new StringBuffer(" - ")};
        StringBuffer[] num3 = {
            new StringBuffer(" - "),
            new StringBuffer("  |"),
            new StringBuffer(" - "),
            new StringBuffer("  |"),
            new StringBuffer(" - ")};
        StringBuffer[] num4 = {
            new StringBuffer("   "),
            new StringBuffer("| |"),
            new StringBuffer(" - "),
            new StringBuffer("  |"),
            new StringBuffer("   ")};
        StringBuffer[] num5 = {
            new StringBuffer(" - "),
            new StringBuffer("|  "),
            new StringBuffer(" - "),
            new StringBuffer("  |"),
            new StringBuffer(" - ")};
        StringBuffer[] num6 = {
            new StringBuffer(" - "),
            new StringBuffer("|  "),
            new StringBuffer(" - "),
            new StringBuffer("| |"),
            new StringBuffer(" - ")};
        StringBuffer[] num7 = {
            new StringBuffer(" - "),
            new StringBuffer("  |"),
            new StringBuffer("   "),
            new StringBuffer("  |"),
            new StringBuffer("   ")};
        StringBuffer[] num8 = {
            new StringBuffer(" - "),
            new StringBuffer("| |"),
            new StringBuffer(" - "),
            new StringBuffer("| |"),
            new StringBuffer(" - ")};
        StringBuffer[] num9 = {
            new StringBuffer(" - "),
            new StringBuffer("| |"),
            new StringBuffer(" - "),
            new StringBuffer("  |"),
            new StringBuffer(" - ")};

        List list = new ArrayList();
        list.addAll(Arrays.asList(num0, num1, num2, num3, num4, num5, num6, num7, num8, num9));
        return list;
    }
}
