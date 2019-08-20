package core.basesyntax;

public class FlipBitCorrect {

    protected int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1));
    }
}
