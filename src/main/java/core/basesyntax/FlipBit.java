package core.basesyntax;

public class FlipBit {

    protected int flipBit(int value, int bitIndex) {
        return value ^ (1 << (bitIndex - 1));
    }
}
