public class Anagram {

    public static void main(String[] args) {

        int [][] darr = {{12,34,56,78}, {13,45,76}};

        for(int row=0; row< darr.length; row++){

            for(int col=0; col<darr[row].length; col++){

                System.out.println(darr[row][col]);
            }
        }
    }

}
