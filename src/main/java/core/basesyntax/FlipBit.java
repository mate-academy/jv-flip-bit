package core.basesyntax;

import java.util.Arrays;

public class FlipBit {

    /**
     * Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     */
    public int flipBit(int value, int bitIndex) {
        String stringValue = String.format("%32s", Integer.toBinaryString(value)).replace(' ', '0');
        StringBuilder stringBuilder = new StringBuilder(stringValue);
        stringBuilder.reverse();
        char[] array = stringBuilder.toString().toCharArray();
        array[bitIndex - 1] = array[bitIndex - 1] == '0' ? '1' : '0';
        stringBuilder = new StringBuilder(new String(array));
        String result = stringBuilder.reverse().toString();
        return Integer.valueOf(result, 2);
    }
}
