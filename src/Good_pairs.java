public class Good_pairs {
    public static int numIdenticalPairs(int[] nums) {

        int pairs = 0;

        for(int i=0; i<nums.length; i++){

            for(int j= i+1; j<nums.length; j++){

                if(nums[i]==nums[j]){

                    pairs++;
                }
            }

        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};

        Good_pairs numIdenticalPairs = new Good_pairs();

        System.out.println(numIdenticalPairs(nums));
    }
}
