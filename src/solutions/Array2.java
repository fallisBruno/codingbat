package solutions;

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



}
