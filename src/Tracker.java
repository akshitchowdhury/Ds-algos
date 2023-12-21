import java.util.Arrays;

public class Tracker {

    //1365. How Many Numbers Are Smaller Than the Current Number

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] tracker = new int [nums.length];

        int count = 0;

        sort(nums);
        int i = 0;
        while(i< nums.length-1){
            int j = i+1;
            while(j<nums.length)
            if(nums[i]>nums[j]){

                count++;
                j++;
            }
            i++;
        }



        return tracker;
    }

    static int[] sort(int [] arr){

        int i = 0;

        while(i<arr.length-1){

            int temp;
            int j = i+1;
            while(j<arr.length){
                if(arr[j]> arr[i]){
                    temp = arr[i];
                    arr[i]  =arr[j];
                    arr[j] = temp;
                }
                j++;
            }

            i++;
        }
        return arr;

    }

    public static void main(String[] args) {
        int [] arr = {1,5,2,2,8};
        Tracker mode  =new Tracker();

        mode.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
