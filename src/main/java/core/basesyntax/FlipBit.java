package core.basesyntax;

public class FlipBit {

    /**
     * <p>Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).</p>
     */
    public int flipBit(int value, int bitIndex) {
        int i = (int) Math.pow(2,bitIndex - 1);
        return ((value ^ (value + i)) == i) ? value + i : value - i;
    }
}
