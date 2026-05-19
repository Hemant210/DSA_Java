package Data_structure_Practice.TwoD_Arrays;
import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    // Time Complexity O(m × n) & Total Space O(1)
    public static List<Integer> spiral_matrix(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int RC = matrix[0].length - 1;
        int LC = 0;

        while (top <= bottom && RC >= LC) {
            for (int i = LC; i <= RC; i++) {
                ans.add(matrix[top][i]);
            }

            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][RC]);
            }
            RC--;

            if (top <= bottom) {
                for (int i = RC; i >= LC; i--) {
                    ans.add(matrix[bottom][i]);
                }

                bottom--;
            }

            if (LC <= RC) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][LC]);
                }

                LC++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        List<Integer> result = spiral_matrix(matrix);

        System.out.println("Spiral Order:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
