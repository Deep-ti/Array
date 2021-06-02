import java.util.BitSet;

public class MissingInteger {

    private int sizeOfArrayExpected = 100;

    void findInteger(int[] numbers) {
        int differenceSize = sizeOfArrayExpected - numbers.length;
        printMissingNumberInArray(numbers, differenceSize);
    }

    private void printMissingNumberInArray(int[] numbers, int differenceSize) {
        BitSet bitSet = new BitSet(numbers.length);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.println();
        System.out.println("Sorted Integers :: " + bitSet);
        int lastMissingIndex = 0;
        System.out.println("Missing Integers :: ");
        for (int i = 0; i < differenceSize; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.print(++lastMissingIndex + " ");
        }
    }
}
