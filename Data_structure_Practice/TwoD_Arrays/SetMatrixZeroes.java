package Data_structure_Practice.TwoD_Arrays;

public class SetMatrixZeroes {
    //Time Complexity: O(m × n) & Space Complexity: O(1)
    public static void setzeroes(int[][] matrix){
        boolean FR = true;
        boolean FC = true;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        FR = true;
                    }
                     
                    if (j == 0) {
                        FC = true;
                    }

                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[0].length; j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (FR) {
            for(int i = 0; i < matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }

        if (FC) {
            for(int i = 0; i < matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };

        setzeroes(matrix);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.println(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
