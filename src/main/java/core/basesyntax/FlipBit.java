package core.basesyntax;

public class FlipBit {

    /**
     * Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     *<p>
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     * </p>
     */
    public int flipBit(int value, int bitIndex) {
        StringBuilder binaryString = new StringBuilder(Integer.toBinaryString(value));
        if (binaryString.length() < bitIndex) {
            StringBuilder result = new StringBuilder();
            result.append('1');
            for (int i = 1; i < bitIndex - binaryString.length(); i++) {
                result.append('0');
            }
            return Integer.parseInt(result.append(binaryString).toString(), 2);
        }
        int bit = binaryString.length() - bitIndex;
        if (binaryString.charAt(bit) == '0') {
            binaryString.replace(bit, bit + 1, "1");
        } else {
            binaryString.replace(bit, bit + 1, "0");
        }
        return Integer.parseInt(binaryString.toString(), 2);
    }
}
