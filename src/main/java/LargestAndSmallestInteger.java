import java.util.BitSet;

public class LargestAndSmallestInteger {
    public void findLargestAndSmallestInteger(int[] numbers){
        BitSet bitSet = new BitSet(numbers.length);
        for (int number : numbers) {
            bitSet.set(number - 1);
        }
        System.out.println("Largest:::: " + (bitSet.nextSetBit(0)+1));
        System.out.println("Smallest:::: " + (bitSet.nextSetBit(bitSet.length()-1)+1));
    }
}
