package core.basesyntax;

public class FlipBit {

    /**
     * Реализуйте метод flipBit(int value, int bitIndex), изменяющий значение одного бита
     * заданного целого числа на противоположное.
     * Данная задача актуальна, например, при работе с битовыми полями.
     *
     * Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
     */
    public int flipBit(int value, int bitIndex) {
        String binaryRepresentation = "";
        int count = 1;
        while (count <=32) {
            if (value == 0) {
                binaryRepresentation = "0" + binaryRepresentation;
                count++;
            } else {
                while (value != 0) {
                    binaryRepresentation = value % 2 + binaryRepresentation;
                    value = value / 2;
                    count++;
                }
            }
        }
        char elementToChang = (binaryRepresentation.charAt(binaryRepresentation.length()- bitIndex)) == '1' ? '0' : '1';
        StringBuilder correctRow = new StringBuilder(binaryRepresentation);
        correctRow.setCharAt((binaryRepresentation.length() - bitIndex), elementToChang);

        return Integer.parseInt(correctRow.toString(), 2);
    }
}
