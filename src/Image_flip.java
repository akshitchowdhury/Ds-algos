public class Image_flip {
    public int[][] flipAndInvertImage(int[][] image) {


        for(int row = 0; row< image.length; row++ ){

            //1st  reverse
            reverse(image[row]);
            for(int col = 0; col< image[row].length; col++ ){

                //2nd invert

                //  image[row][col] = 1 - image[row][col];
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
    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap elements at positions left and right
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move towards the center
            left++;
            right--;
        }
    }
}







