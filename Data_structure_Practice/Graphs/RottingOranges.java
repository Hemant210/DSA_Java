package Data_structure_Practice.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    static class Pair {
        int row;
        int col;
        int time;

        Pair(int row, int col, int time) {
            this.time = time;
            this.row = row;
            this.col = col;
        }
    }

    private static int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int ans = 0;

        boolean[][] vis = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j, 0));
                    vis[i][j] = true;
                }
            }
        }

        // Breadth first search
        while (!q.isEmpty()) {
            Pair curr = q.poll();

            int i = curr.row;
            int j = curr.col;
            int time = curr.time;

            ans = Math.max(ans, time);

            if (i - 1 >= 0 && !vis[i - 1][j] && grid[i - 1][j] == 1) {
                q.offer(new Pair(i - 1, j, time + 1));
                vis[i - 1][j] = true;
            }

            if (i + 1 < n && !vis[i + 1][j] && grid[i + 1][j] == 1) {
                q.offer(new Pair(i + 1, j, time + 1));
                vis[i + 1][j] = true;
            }

            if (j - 1 >= 0 && !vis[j][j - 1] && grid[i][j - 1] == 1) {
                q.offer(new Pair(i, j - 1, time + 1));
                vis[i][j - 1] = true;
            }

            if (j + 1 < m && !vis[j][j + 1] && grid[i][j + 1] == 1) {
                q.offer(new Pair(i, j + 1, time + 1));
                vis[i][j + 1] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    return -1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[][] grid = {
                { 2, 1, 1 },
                { 1, 1, 0 },
                { 0, 1, 1 }
        };

        System.out.println("Minimum Minutes = " + orangesRotting(grid));
    }
}
