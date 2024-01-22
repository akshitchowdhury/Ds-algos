public class Two_sum {

    public static void main(String[] args) {

    }
    public int[] twoSum(int[] numbers, int target) {

        int [] store = new int[2];

        int l = 0;
        int h= numbers.length-1;

        while(l<h){

            int res = target - numbers[l];

            if(res == numbers[h]&& res!= numbers[l]){
                store[0] = l+1;
                store[1] = h+1;
            }

        }


        return store;
    }
}
