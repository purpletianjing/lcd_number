import java.util.List;

public class LcdNumberPrinter {
    public void printNumber(int size, String numberStr) {
        LcdNumberProducer lcdNumberProducer = new LcdNumberProducer();
        List<StringBuffer[]> list =
            lcdNumberProducer.produceOriginalNumber(numberStr);

        for (int i = 0; i < 5; i++) {
            if (i == 1 || i == 3) {
                for (int z = 0; z < size - 1; z++) {
                    for (int j = 0; j < list.size(); j++) {
                        if (!(list.get(j)[0].charAt(1) == ' ' &&
                            list.get(j)[2].charAt(1) == ' ' &&
                            list.get(j)[4].charAt(1) == ' ')) {
                            list.get(j)[i].insert(1, " ");
                        }
                    }
                }
                for (int z = 0; z < size; z++) {
                    for (int j = 0; j < list.size(); j++) {
                        System.out.print(list.get(j)[i] + " ");
                    }
                    System.out.println();
                }
            } else if (i == 0 || i == 4) {
                for (int j = 0; j < list.size(); j++) {
                    for (int z = 0; z < size - 1; z++) {
                        if (list.get(j)[i].charAt(1) == '-') {
                            list.get(j)[i].insert(1, "-");
                        } else if (list.get(j)[2].charAt(1) == '-') {
                            list.get(j)[i].insert(1, " ");
                        }
                    }
                    System.out.print(list.get(j)[i] + " ");
                }
                System.out.println();

            } else {
                for (int j = 0; j < list.size(); j++) {
                    for (int z = 0; z < size - 1; z++) {
                        if ((list.get(j)[i].charAt(1) == ' ') &&
                            (!(list.get(j)[0].charAt(1) == ' ' &&
                                list.get(j)[4].charAt(1) == ' '))) {
                            list.get(j)[i].insert(1, " ");
                        } else if (list.get(j)[i].charAt(1) == '-') {
                            list.get(j)[i].insert(1, "-");
                        }
                    }
                    System.out.print(list.get(j)[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
