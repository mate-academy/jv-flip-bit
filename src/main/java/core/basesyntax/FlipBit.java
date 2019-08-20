package core.basesyntax;

public class FlipBit {

    /**
     * Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     */
    public int flipBit(int value, int bitIndex) {
        String binaryNumber = "";
        int number = 0;
        if (value == 0) {
            binaryNumber = "0";
        }
        while (value >= 1) {
            if (value % 2 != 0) {
                binaryNumber += "1";
            } else {
                binaryNumber += "0";
            }
            value /= 2;
        }
        if (binaryNumber.length() < bitIndex) {
            for (int i = 0; i < bitIndex; i++) {
                binaryNumber += "0";
            }
        }
        char[] array = binaryNumber.toCharArray();
        if (array[bitIndex - 1] == '1') {
            array[bitIndex - 1] = '0';
        } else {
            array[bitIndex - 1] = '1';
        }
        for (int i = 0; i < array.length; i++) {
            number += Character.getNumericValue(array[i]) * Math.pow(2, i);
        }
        return number;
    }

}