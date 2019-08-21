package core.basesyntax;

public class FlipBit {

    /**
     * Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     */
    public int flipBit(int value, int bitIndex) {
        String binaryNumber = Integer.toBinaryString(value);
        int number = 0;
        if (binaryNumber.length() < bitIndex) {
            for (int i = 0; i < bitIndex; i++) {
                binaryNumber = "0" + binaryNumber;
            }
        }
        char[] array = binaryNumber.toCharArray();
        if (array[array.length - bitIndex] == '1') {
            array[array.length - bitIndex] = '0';
        } else {
            array[array.length - bitIndex] = '1';
        }
        for (int i = 0; i < array.length; i++) {
            number += Character.getNumericValue(array[i])
                    * Math.pow(2, (array.length - 1 - i));
        }
        return number;
    }

}