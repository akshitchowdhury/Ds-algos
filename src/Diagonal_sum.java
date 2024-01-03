public class Diagonal_sum {
    public int diagonalSum(int[][] mat) {

        int res = 0;

        for(int r=0; r< mat.length; r++){
            int first = 0;


            int len = mat[r].length;
            for(first=0; first<len && len>=0; first++){
                len--;

                res = mat[r][first]+ mat[r][len];

                if(len ==1){
                    res = mat[r][first];
                }

            }


        }


        return res;
    }
}
