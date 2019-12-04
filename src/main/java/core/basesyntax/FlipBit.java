package core.basesyntax;

public class FlipBit {

    /**
     * <p>Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).</p>
     */
    public int flipBit(int value, int bitIndex) {
        StringBuilder bin = new StringBuilder(Integer.toBinaryString(value));
        StringBuilder result = new StringBuilder();
        int stringLength = bin.length();
        if (stringLength < bitIndex) {
            for (int i = 0; i < bitIndex - stringLength; i++) {
                result.append('0');
            }
        }
        result.append(bin);
        char bit = (result.charAt(result.length() - bitIndex) == '0') ? '1' : '0';
        result.setCharAt(result.length() - bitIndex, bit);
        return Integer.parseInt(result.toString(), 2);
    }
}
