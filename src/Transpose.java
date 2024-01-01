public class Transpose {


    public int[][] transpose(int[][] matrix) {

            int l1 = matrix.length;
            int l2=  matrix[0].length;

            int [][] store = new int [l2][l1];

            for(int row=0; row< l1; row++){
                for(int col = 0; col<l2; col++){

                    store[col][row] = matrix[row][col];
                }
            }


        return matrix;
    }
}
