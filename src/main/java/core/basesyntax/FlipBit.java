package core.basesyntax;

public class FlipBit {

    /**
     * Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.p
     *
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     */
    public int flipBit(int value, int bitIndex) {
        if (bitIndex < 1 || bitIndex > 32) {
            System.out.println("Not valid bitIndex");
            return 0;
        }
        return value ^ (1 << bitIndex);
    }
}
