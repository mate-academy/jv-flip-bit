package core.basesyntax;

public class FlipBit {

    /**
     * <p>Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).</p>
     */
    public int flipBit(int value, int bitIndex) {
        String binString = Integer.toBinaryString(value);
        int binLength = binString.length();
        if (binLength < bitIndex) {
            for (int i = 0; i < bitIndex - binLength; i++) {
                binString = '0' + binString;
            }
        }
        char[] binChar = binString.toCharArray();
        int n = binChar.length - bitIndex;
        binChar[n] = binChar[n] == '0' ? '1' : '0';
        String result = new String(binChar);
        return Integer.parseInt(result, 2);
    }
}
