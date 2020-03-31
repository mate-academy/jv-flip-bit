package core.basesyntax;

public class FlipBit {

    /**
     * <p>Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).</p>
     */
    public int flipBit(int value, int bitIndex) {
        // reach the bit at the given index by shifting bits
        // create mask of the number where only predefined bit is set to 1
        // using XOR replace that bit (XOR returns "true" only if there is one true)
        return value ^ (1 << (bitIndex - 1));
    }
}
