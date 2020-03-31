package core.basesyntax;

public class FlipBit {

    /**
     * <p>Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).</p>
     */
    public static int flipBit(int value, int bitIndex) {
        bitIndex = bitIndex - 1;
        StringBuilder stringBuilder = new StringBuilder(Integer.toBinaryString(value));
        stringBuilder = stringBuilder.reverse();

        if (stringBuilder.length() > bitIndex) {
            if (stringBuilder.charAt(bitIndex) == '1') {
                stringBuilder.setCharAt(bitIndex, '0');
            } else {
                stringBuilder.setCharAt(bitIndex, '1');
            }
        } else {
            while (stringBuilder.length() <= bitIndex - 1) {
                stringBuilder.append('0');
            }
            stringBuilder.append('1');
        }
        return Integer.parseInt(stringBuilder.reverse().toString(), 2);
    }
}
