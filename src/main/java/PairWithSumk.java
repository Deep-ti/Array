import java.util.Arrays;

public class PairWithSumk {
    public void findPairOfIntegersWithSumK(int[] numbers, int k){
        Arrays.sort(numbers);
        int left = 0, right = numbers.length-1;
        while(left < right){
            int sum = numbers[left]+numbers[right];
            if(sum == k){
                System.out.println("Pair of numbers with sum " + k+ " are " + numbers[left]+" and "+numbers[right]);
                left++;
                right--;
            }else if(sum < k){
                left++;
            }else{
                right--;
            }
        }
    }
}
