public class Diagonal_sum {
    public int diagonalSum(int[][] mat) {

        int res1 = 0;
        int res2 = 0;

        int mid = mat.length/2;
        for(int row = 0; row<mid; row++){
            int i = 0;
            int j = mat[row].length-1;
            int sum1= 0;
            while(i<=j){

                sum1 += mat[row][i]+mat[row][j];
                i++;
                j--;

                if(i==j){
                    sum1 = mat[row][j];
                }

            }
            res1 = sum1;

        }


        for(int row = mat.length-1; row>=mid; row--){
            int i = 0;
            int j = mat[row].length-1;
            int sum2= 0;
            while(i<=j){

                sum2 += mat[row][i]+mat[row][j];
                i++;
                j--;

                if(i==j){
                    sum2 = mat[row][j];
                }

            }
            res2 = sum2;

        }

        return res1+res2;
    }
}
