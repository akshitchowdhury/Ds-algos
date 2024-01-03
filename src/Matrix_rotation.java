import java.util.Arrays;

public class Matrix_rotation {


    public static void main(String[] args) {

        int mat[][] = {{0, 0}, {0, 1}};
        int target[][] = {{0, 0}, {1, 0}};

        Matrix_rotation res = new Matrix_rotation();
        System.out.println(res.findRotation(mat, target));
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        int i = 0;
        boolean check = true;  // Initialize as true

        while (i < mat.length) {
            if (!Arrays.toString(mat[i]).equals(Arrays.toString(target[target.length - 1 - i]))) {
                check = false;
                break;  // Break out of the loop once a mismatch is found
            }
            i++;
        }

        return check;
    }
}
