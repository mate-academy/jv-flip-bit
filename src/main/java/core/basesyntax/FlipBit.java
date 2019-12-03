package core.basesyntax;

public class FlipBit {

    /**
     * <p>Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).</p>
     */
    public int flipBit(int value, int bitIndex) {
        String binstr = Integer.toBinaryString(value);
        int lenght = binstr.length();
        if (lenght < bitIndex) {
            for (int i = 0; i < bitIndex - lenght; i++) {
                binstr = '0' + binstr;
            }
        }
        char[] binchr = binstr.toCharArray();
        binchr[binchr.length - bitIndex] = binchr[binchr.length - bitIndex] == '0' ? '1' : '0';
        String result = new String(binchr);
        return Integer.parseInt(result, 2);
    }
}
