package Data_structure_Practice.Graphs;

public class Number_Islands {
    public static void DFS(int i, int j, boolean[][] vis, char[][] grid, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m || vis[i][j] || grid[i][j] != '1') {
            return;
        }

        vis[i][j] = true;

        DFS(i - 1, j, vis, grid, n, m);

        DFS(i, j + 1, vis, grid, n, m);

        DFS(i + 1, j, vis, grid, n, m);

        DFS(i, j - 1, vis, grid, n, m);
    }

    public static int numisland(char[][] grid) {
        int island = 0;
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    DFS(i, j, vis, grid, n, m);
                    island++;
                }
            }
        }

        return island;
    }

    public static void main(String[] args) {
        char[][] grid = {
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }
        };

        int ans = numisland(grid);

        System.out.println("Number of Islands = " + ans);
    }
}
