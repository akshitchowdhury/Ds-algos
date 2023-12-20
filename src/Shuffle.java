public class Shuffle {

    public int[] shuffle(int[] nums, int n) {

        int [] ans = {};

        for(int i=0; i<n; i++){

            for(int j= n+1; j<nums.length; j++){

                if(i%2==0){
                    ans[i+i] = nums[i];
                }

                else{

                    ans[i] = nums[j];
                }
            }


        }
        return ans;
    }

    public static void main(String[] args) {




    }
}
