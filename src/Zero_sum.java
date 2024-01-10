import java.util.Arrays;

public class Zero_sum {
    public static void main(String[] args) {

        int rand =(int) Math.random();







    int arr[] = new int[5];

    for(int i =0; i<arr.length; i++){
        double num = Math.random();
        int whole = (int) Math.round(num*10);
        int nwhole = -1*whole;

        if(arr.length==1){
            arr[i] = 0;
        }
        else if(arr.length>1){

            if(arr.length%2==0){
                arr[i] = whole;
                arr[arr.length-1-i] = -1*whole;
            }
            else{
                arr[arr.length/2] =0;
                arr[i] = whole;
                arr[arr.length-1-i] = -1*whole;
            }


        }



    }


        System.out.println(Arrays.toString(arr));



    }



}
