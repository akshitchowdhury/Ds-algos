import java.util.Arrays;

public class Matrix_rotation {


    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = rotateMatrix(mat, n);
        }

        return false;
    }

    private int[][] rotateMatrix(int[][] matrix, int n) {
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        return rotated;
    }
}
