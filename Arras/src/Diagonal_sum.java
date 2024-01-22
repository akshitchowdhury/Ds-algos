public class Diagonal_sum {
    public static void main(String[] args) {

    }

    public int diagonalSum(int[][] mat) {

        int sum = -1;

        int l =0;
        int h = mat.length-1;
        int row = 0;
        int mid = l+ (h-l)/2;
        while(l!= mat.length-1 && h!=0 && row<mat.length-1){

            sum = mat[row][l]+ mat[row][h];

            if(mat.length%2==0){
                return sum;
            }
            else{
                sum = sum - mat[mat.length/2][mid];
            }
            l++;
            h--;

            row++;

        }
        return sum;
    }
}
