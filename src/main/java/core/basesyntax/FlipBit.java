package core.basesyntax;

import java.util.Arrays;

public class FlipBit {

    /**
     * Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     */
    public int flipBit(int value, int bitIndex) {
        int forXor = 1;
        for (int i = 0; i < bitIndex - 1; i++) {
            forXor = forXor * 2;
        }
        return value ^ forXor;
    }
}
