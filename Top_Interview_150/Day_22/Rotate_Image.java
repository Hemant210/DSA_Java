package Top_Interview_150.Day_22;

import java.util.Arrays;

public class Rotate_Image {
    public static void rotate(int[][] matrix){
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            int l = 0, r = n - 1;

            while (l < r) {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        rotate(matrix);
        
        for(int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
