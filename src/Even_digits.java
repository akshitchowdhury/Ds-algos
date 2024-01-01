public class Even_digits {

    public static void main(String[] args) {

        int num = 345;

        String str = Integer.toString(num);
        System.out.println(str.length());
    }

    public int findNumbers(int[] nums) {


        int count =0;
        for(int i=0; i< nums.length; i++){

            if(nums[i]>10){

                String str = Integer.toString(nums[i]);

                int len = str.length();
                if(len%2==0 ){

                    count++;
                }

            }


        }

        return count;
    }
}
