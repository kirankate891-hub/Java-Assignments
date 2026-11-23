public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 5;
        int[][] m = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1, num = 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) m[top][j] = num++;
            top++;
            for (int i = top; i <= bottom; i++) m[i][right] = num++;
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) m[bottom][j] = num++;
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) m[i][left] = num++;
                left++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", m[i][j]);
            }
            System.out.println();
        }
    }
}
