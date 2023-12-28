import java.util.Arrays;

public class Rotate_ksteps {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        int i=0;
        while(i<k){

            int formula = (n-k+i)%n;

            int temp = nums[i];
            nums[i] = nums[formula];

            nums[formula] = temp;
            i++;
        }
        // Arrays.toString(nums);

    }
}
