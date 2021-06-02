import java.util.BitSet;

public class RemoveDuplicates {
    public void removeDuplicates(int[] numbers){
        BitSet bitSet = new BitSet(numbers.length);
        for (int number : numbers){
            if(!bitSet.get(number)){
                bitSet.set(number);
            }
        }
        System.out.println(bitSet);
    }
}
