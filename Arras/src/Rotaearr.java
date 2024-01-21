import java.util.Arrays;

public class Rotaearr {

    public static int[] rotate(int[] nums, int k) {

        int store [] = new int[nums.length];

        int length = nums.length;
        for(int i=0; i< k; i++){

            store[i] = nums[length-k+i];

        }
        for(int j =3; j< length; j++){

            store[j] = nums[j-3];
        }

        Arrays.toString(store);
        return store;
    }


    public static void main(String[] args) {
int nums []= {1,2,3,4,5,6,7};
int k =3;
//        int store [] = new int[nums.length];
//
//        int length = nums.length;
//        for(int i=0; i< k; i++){
//
//            store[i] = nums[length-k+i];
//
//        }
//        for(int j =3; j< length; j++){
//
//            store[j] = nums[j-3];
//        }
//
//
//        for(int m = 0; m< store.length; m++){
//
//            System.out.println(store[m]);
//
//        }

        Rotaearr turn = new Rotaearr();

        System.out.println(Arrays.toString(rotate(nums,k)));
        rotate(nums, k);


    }
}
