package top_patterns.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands{
public int numIslands(char[][] grid) {
    int count = 0;
    int m = grid.length, n = grid[0].length;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {

            if (grid[i][j] == '1') {
                bfs(grid, i, j);
                count++;
            }
        }
    }
    return count;
}

private void bfs(char[][] grid, int i, int j) {
    Queue<int[]> q = new LinkedList<>();
    q.offer(new int[]{i, j});
    grid[i][j] = '0';

    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    while (!q.isEmpty()) {
        int[] cur = q.poll();

        for (int[] d : dirs) {
            int x = cur[0] + d[0];
            int y = cur[1] + d[1];

            if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] == '1') {
                q.offer(new int[]{x, y});
                grid[x][y] = '0';
            }
        }
    }
}

}