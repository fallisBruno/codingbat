package solutions;

import java.util.stream.IntStream;

public class Array2 {

    public static void main(String[] args) {


    }

    public static int countEvens(int[] nums) {
        int result = 0;
        for(int num : nums)
            if(num % 2 == 0) result++;
        return result;
    }

    public static int bigDiff(int[] nums) {
        int max = nums[0], min = nums[0];
        for(int num : nums){
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        return max - min;
    }

    public static int centeredAverage(int[] nums) {
        int max = nums[0], min = nums[0], average = 0;
        for(int index = 0; index < nums.length ;index++){
            int num = nums[index];
            max = Math.max(num, max);
            min = Math.min(num, min);
            average += num;
        }
        return (average - min - max) / (nums.length - 2);
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for(int index = 0; index < nums.length;index++){
            if(index >= nums.length) return sum;
            if(nums[index] == 13){
                index++;
            }else{
                sum+=nums[index];
            }
        }
        return sum;
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        boolean waitFor7 = false;
        for(int index = 0;index < nums.length;index++){
            int currentNumber = nums[index];
            if(currentNumber == 6){
                waitFor7 = true;
            }else if(currentNumber == 7 && waitFor7){
                waitFor7 = false;
                continue;
            }
            if(!waitFor7){
                sum+=currentNumber;
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for(int index = 0;index < nums.length - 1;index++){
            if(nums[index] == 2 && nums[index + 1] == 2){
                return true;
            }
        }
        return false;
    }

    public static boolean lucky13(int[] nums) {
        for (int index = 0; index < nums.length; index++) {
            int currentNumber = nums[index];
            if(currentNumber == 1 || currentNumber == 3) return false;
        }
        return true;
    }

    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int index = 0; index < nums.length; index++) {
            int currentNumber = nums[index];
            if(currentNumber == 2) {
                sum += 2;
                if(sum > 8) return false;
            }
        }
        return sum == 8;
    }

    public static boolean more14(int[] nums) {
        int countOne = 0, countFour = 0;
        for (int index = 0; index < nums.length; index++) {
            int currentNumber = nums[index];
            if(currentNumber == 1)
                countOne++;
            else if(currentNumber == 4)
                countFour++;
        }
        return countOne > countFour;
    }

    public static int[] fizzArray(int n) {
        int [] result = new int[n];
        for (int index = 0; index < n; index++) {
            result[index] = index;
        }
        return result;
    }

    public static boolean only14(int[] nums) {
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != 1 && nums[index] != 4) return false;
        }
        return true;
    }

    public static String[] fizzArray2(int n) {
        String [] result = new String[n];
        for (int index = 0; index < n; index++) {
            result[index] = String.valueOf(index);
        }
        return result;
    }

    public boolean no14(int[] nums) {
        boolean hasOne = false, hasFour = false;
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] == 1) hasOne = true;
            if(nums[index] == 4) hasFour = true;
            if(hasOne && hasFour) return false;
        }
        return true;
    }

    public static boolean isEverywhere(int[] nums, int val) {
        for (int index = 0; index < nums.length - 1; index++) {
            int currentNumber = nums[index];
            int nextNumber = nums[index + 1];
            if(currentNumber != val && nextNumber != val) return false;
        }
        return true;
    }



}
