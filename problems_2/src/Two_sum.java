public class Two_sum {
    public int[] twoSum(int[] numbers, int target) {
        int [] stock = new int[2];

        for(int i=0; i<numbers.length; i++){
            int limit = -1;
            if(numbers[i]>=target){
                limit =  i;
                for(int j=0; j<limit; j++){
                    for (int k=1; k< limit; k++){
                        if(numbers[j]+numbers[k]==target){
                            stock[0] = j+1;
                            stock[1] = k+1;
                        }
                    }
                }
            }
            else{
                limit = numbers.length;
                for(int j=0; j<limit; j++){
                    for (int k=1; k< limit; k++){
                        if(numbers[j]+numbers[k]==target){
                            stock[0] = j+1;
                            stock[1] = k+1;
                        }
                    }
                }
            }


        }


        return stock;
    }

}
