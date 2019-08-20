package core.basesyntax;

public class FlipBit {
    public static void main(String args[]) {
        flipBit(5, 1);
    }

    /**
     * Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * <p>
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     */
    static int flipBit(int value, int bitIndex) {
        String valueStr = Integer.toBinaryString(value);
        StringBuilder stringBuilder = new StringBuilder(valueStr);
        System.out.println(stringBuilder);
        if (stringBuilder.charAt(bitIndex) == '0') {
            stringBuilder.replace(bitIndex, bitIndex + 1, "1");
        } else {
            stringBuilder.replace(bitIndex, bitIndex + 1, "0");
        }
        System.out.println(stringBuilder);
        String str = new String(stringBuilder);
        return Integer.parseInt(str, 2);
    }

}
