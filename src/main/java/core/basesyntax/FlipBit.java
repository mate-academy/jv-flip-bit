package core.basesyntax;

public class FlipBit {

    /**
     * <p>Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).</p>
     */
    public static int flipBit(int value, int bitIndex) {
        int[] bitArray = new int[32];
        String bitString = Integer.toBinaryString(value);
        char[] tempBitArray = bitString.toCharArray();
        int j = 0;
        String res = "";
        for (int i = bitArray.length - tempBitArray.length; i < bitArray.length; i++) {
            String x = "";
            x += tempBitArray[j];
            bitArray[i] = Integer.parseInt(x);
            j++;
        }
        if (bitArray[bitArray.length - bitIndex] == 0) {
            bitArray[bitArray.length - bitIndex] = 1;
        } else {
            bitArray[bitArray.length - bitIndex] = 0;
        }
        for (int i = 0; i < bitArray.length; i++) {
            res += bitArray[i];
        }
        return Integer.parseInt(res, 2);
    }

    public static void main(String[] args) {
        System.out.println(flipBit(10,1));
    }
}
