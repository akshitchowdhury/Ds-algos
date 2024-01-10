public class Diagonal_sum {
    public int diagonalSum(int[][] mat) {

        int res1 = 0;
        int res2 = 0;
        int fres = -1;
        int mid = mat.length/2;
        if(mat.length>1) {

                for(int row =0 ; row<mat.length; row++){

                    int i = row;
                    int j = mat.length-1-i;

                    res1 += mat[row][i];
                    res2 += mat[row][j];

                }
                fres = res1+res2;

                if(mat.length%2==1){
                    int common = mat[mid][mid];
                    fres -= common;
                }
        }

        else{
            fres = mat[0][0];
            return fres;
            }


        return fres;
    }
}
