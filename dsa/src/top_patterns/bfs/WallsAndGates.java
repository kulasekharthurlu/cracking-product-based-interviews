package top_patterns.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates{
public void wallsAndGates(int[][] rooms) {
    Queue<int[]> q = new LinkedList<>();

    for (int i = 0; i < rooms.length; i++) {
        for (int j = 0; j < rooms[0].length; j++) {
            if (rooms[i][j] == 0) q.offer(new int[]{i, j});
        }
    }

    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

    while (!q.isEmpty()) {
        int[] cur = q.poll();

        for (int[] d : dirs) {
            int x = cur[0] + d[0];
            int y = cur[1] + d[1];

            if (x >= 0 && y >= 0 && x < rooms.length && y < rooms[0].length && rooms[x][y] == Integer.MAX_VALUE) {
                rooms[x][y] = rooms[cur[0]][cur[1]] + 1;
                q.offer(new int[]{x, y});
            }
        }
    }
}
}