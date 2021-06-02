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
    }
}
