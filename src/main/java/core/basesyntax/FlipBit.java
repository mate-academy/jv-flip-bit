package core.basesyntax;

public class FlipBit {
    /**
     * Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     */
    public int flipBit(int value, int bitIndex) {
        StringBuilder arr = new StringBuilder(Integer.toBinaryString(value));
        if (bitIndex > arr.length()) {
            arr = new StringBuilder();
            for (int i = 0; i <= bitIndex - Integer.toBinaryString(value).length(); i++) {
                arr.append('0');
            }
            arr.append(Integer.toBinaryString(value));
        }
        char correctBit = arr.charAt(arr.length() - bitIndex) == '1' ? '0' : '1';
        arr.setCharAt(arr.length() - bitIndex, correctBit);
        return Integer.parseInt(new String(arr), 2);
    }
}
