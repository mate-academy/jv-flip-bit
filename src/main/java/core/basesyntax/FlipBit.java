package core.basesyntax;

public class FlipBit {

    /**
     * Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     */
    public int flipBit(int value, int bitIndex) {
        int index = 1;
        for (int i = 1; i < bitIndex; i++) {
            index *= 2;
        }
        return value ^ index;
    }
}
