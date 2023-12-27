public class Image_flip {
    public int[][] flipAndInvertImage(int[][] image) {


    for(int row = 0; row< image.length; row++ ){

        for(int col = 0; col< image[row].length; col++ ){

            //1st  reverse

        reverse(image[row]);
            //2nd invert

        if(image[row][col] == 0){

            image[row][col] = 1;
        }

        else{
            image[row][col] = 0;
        }


        }
    }


        return image;

    }


    static int[] reverse(int[] arr){


        for(int i=0; i<arr.length; i++){

            int j = arr.length - 1 - i;  // Calculate the index from the end

            // Swap elements at positions i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;


        }

        return arr;
    }


}
