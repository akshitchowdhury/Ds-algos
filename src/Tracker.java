import java.util.Arrays;

public class Tracker {

    //1365. How Many Numbers Are Smaller Than the Current Number

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] tracker = new int [nums.length];

        int count;


        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            tracker[i] = count;
        }


        return tracker;
    }

    public static void main(String[] args) {
        int [] arr = {1,5,2,2,8};
        Tracker mode  =new Tracker();

//        mode.sort(arr);
        mode.smallerNumbersThanCurrent(arr);

        System.out.println(mode.smallerNumbersThanCurrent(arr));
    }
}
