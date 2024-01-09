import java.util.Arrays;

public class Color_sort {
    public void sortColors(int[] nums) {

    }

    public static void main(String[] args) {
            int arr[] = {2,0,2,1,1,0};
   int neo[] = new int[arr.length];

for(int i=0; i< arr.length;i++){
    int min = arr[i];
    for(int j= 0; j<arr.length; j++){
        int temp = -1;
        if(arr[j]< min){
            temp = min;
            min = arr[j];
            arr[j] = temp;
        }


    }
}







    }
}
