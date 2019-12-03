package core.basesyntax;

public class FlipBit {

    /**
     * <p>Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).</p>
     */
    public static int flipBit(int value, int bitIndex) {
        String binary = Integer.toBinaryString(value);
        StringBuilder buildBinary = new StringBuilder();

        if (bitIndex > binary.length()) {
            for (int i = 0; i < bitIndex - binary.length(); i++) {
                buildBinary.append("0");
            }
        }
        buildBinary.append(binary);

        if (buildBinary.charAt(buildBinary.length() - bitIndex) == '0') {
            buildBinary.replace(buildBinary.length() - bitIndex,
                    buildBinary.length() - bitIndex + 1, "1");
        } else {
            buildBinary.replace(buildBinary.length() - bitIndex,
                    buildBinary.length() - bitIndex + 1, "0");
        }

        return Integer.parseInt(buildBinary.toString(), 2);
    }
}
