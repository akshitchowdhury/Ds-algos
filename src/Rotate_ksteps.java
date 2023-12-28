import java.util.Arrays;

public class Rotate_ksteps {
    public void rotate(int[] nums, int k) {

        for(int i=0; i< nums.length;i++){

            int formula = nums[nums.length-k+i];

            int temp = nums[i];
            nums[i] = nums[formula];

            nums[formula] = temp;

        }
        Arrays.toString(nums);

    }
}
