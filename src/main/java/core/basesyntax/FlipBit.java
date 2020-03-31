package core.basesyntax;

public class FlipBit {

    /**
     * <p>Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).</p>
     */
    public int flipBit(int value, int bitIndex) {
        StringBuilder stringBuilderBinaryValue = new StringBuilder(Integer.toBinaryString(value));
        stringBuilderBinaryValue.reverse();
        while (stringBuilderBinaryValue.length() < 32) {
            stringBuilderBinaryValue.append('0');
        }
        stringBuilderBinaryValue.reverse();
        int indexChangeBite = stringBuilderBinaryValue.length() - bitIndex;
        if (stringBuilderBinaryValue.charAt(indexChangeBite) == '1') {
            stringBuilderBinaryValue.replace(indexChangeBite,
                    indexChangeBite + 1, String.valueOf('0'));
        } else {
            stringBuilderBinaryValue.replace(indexChangeBite,
                    indexChangeBite + 1, String.valueOf('1'));
        }
        return Integer.parseInt(stringBuilderBinaryValue.toString(), 2);
    }
}
