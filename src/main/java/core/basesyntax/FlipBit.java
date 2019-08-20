package core.basesyntax;

public class FlipBit {

    /**
     * Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * <p></p>
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     */
    public int flipBit(int value, int bitIndex) {
        String binString = String.format("%32s", Integer.toBinaryString(value)).replace(' ', '0');
        StringBuilder binary = new StringBuilder(binString);
        binary.reverse();
        binary.setCharAt(bitIndex - 1, binary.charAt(bitIndex - 1) == '1' ? '0' : '1');
        return Integer.parseInt(binary.reverse().toString(), 2);
    }
}
