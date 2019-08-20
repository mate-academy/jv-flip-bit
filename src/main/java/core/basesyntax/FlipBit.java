package core.basesyntax;

public class FlipBit {

    /**
     * Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     */
    public int flipBit(int value, int bitIndex) {
        int valCoppy = value;
        for (int i = 1; i < bitIndex; i++) {
            valCoppy /= 2;
        }
        if (valCoppy % 2 == 1) {
            value -= (int) Math.pow(2, bitIndex - 1);
        } else {
            value += (int) Math.pow(2, bitIndex - 1);
        }
        return value;
    }
}
