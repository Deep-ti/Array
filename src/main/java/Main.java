public class Main {

    public static void main(String[] args) {
        System.out.println("########################################################################");
        System.out.println("Problem1");
        System.out.println("How do you find the missing number in a given integer array of 1 to 100?");
        MissingInteger missingInteger = new MissingInteger();
        int[] missingNumbers = {1, 3, 5,2, 6, 8 ,23, 32, 31, 40, 49,31,11};
        for (int numbers: missingNumbers){
            System.out.print(numbers + " ");
        }
        missingInteger.findInteger(missingNumbers);
        System.out.println();
        System.out.println("########################################################################");
        System.out.println("Problem2");
        System.out.println("How do you find the duplicate number on a given integer array?");
        DuplicateIntegers duplicateIntegers = new DuplicateIntegers();
        int[] duplicateNumbers = {1, 3, 5,2, 6, 6,8,40,11 , 8 ,23, 32, 31, 40, 49,31,11};
        for (int numbers: duplicateNumbers){
            System.out.print(numbers + " ");
        }
        duplicateIntegers.printDuplicate(duplicateNumbers);
        System.out.println();
        System.out.println("########################################################################");
        System.out.println("Problem3");
        System.out.println("How do you find the largest and smallest number in an unsorted integer array?");
        int[] numbers = {59, 3, 5,2, 63, 6,8,40,11 , 8 ,23, 32, 31, 40, 49,31,11};
        for (int number: numbers){
            System.out.print(number + " ");
        }
        System.out.println();
        LargestAndSmallestInteger largestAndSmallestInteger = new LargestAndSmallestInteger();
        largestAndSmallestInteger.findLargestAndSmallestInteger(numbers);
        System.out.println();
        System.out.println("########################################################################");
        System.out.println("Problem4");
        System.out.println("How do you find all pairs of an integer array whose sum is equal to a given number? ");
        int[] sumNumbers = {2,9,5,84,9,3,6,15,12,1,14,4,17};
        for (int number: sumNumbers){
            System.out.print(number + " ");
        }
        System.out.println();
        PairWithSumk pairWithSumk = new PairWithSumk();
        pairWithSumk.findPairOfIntegersWithSumK(sumNumbers, 18);
        System.out.println();
        System.out.println("########################################################################");
        System.out.println("Problem5");
        System.out.println("How are duplicates removed from a given array in Java?");
        for (int number: duplicateNumbers){
            System.out.print(number + " ");
        }
        System.out.println();
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.removeDuplicates(duplicateNumbers);
        System.out.println();
    }
}
