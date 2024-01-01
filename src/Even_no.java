public class Even_no {

    public int findNumbers(int[] nums) {

        int count = 0;

        int i =0;
        while(i< nums.length){
            int even = nums[i]%2;
            if(even==0){
                count++;
            }

            i++;

        }

        return count;

    }
}
