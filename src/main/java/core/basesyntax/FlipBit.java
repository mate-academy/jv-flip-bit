package core.basesyntax;

public class FlipBit {
    public int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex - 1);
    }
}
