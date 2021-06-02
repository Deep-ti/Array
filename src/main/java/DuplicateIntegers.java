import java.util.BitSet;

public class DuplicateIntegers {
    void printDuplicate(int[] numbers){
        BitSet bitSet = new BitSet(numbers.length);
        System.out.println();
        System.out.println("Duplicate Integers :: ");
        for (int number : numbers){
            if(bitSet.get(number-1)){
                System.out.print(number + " ");
            }else{
                bitSet.set(number-1);
            }
        }
    }
}
