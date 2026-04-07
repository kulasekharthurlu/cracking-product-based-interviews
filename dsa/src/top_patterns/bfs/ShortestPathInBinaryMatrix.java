public class ShortestPathInBinaryMatrix{
public int shortestPathBinaryMatrix(int[][] grid) {
    if (grid[0][0] != 0) return -1;

    Queue<int[]> q = new LinkedList<>();
    q.offer(new int[]{0,0});
    grid[0][0] = 1;

    int[][] dirs = {
        {1,0},{-1,0},{0,1},{0,-1},
        {1,1},{1,-1},{-1,1},{-1,-1}
    };

    int steps = 1;

    while (!q.isEmpty()) {
        int size = q.size();

        for (int i = 0; i < size; i++) {
            int[] cur = q.poll();

            if (cur[0] == grid.length - 1 && cur[1] == grid[0].length - 1)
                return steps;

            for (int[] d : dirs) {
                int x = cur[0] + d[0];
                int y = cur[1] + d[1];

                if (x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] == 0) {
                    q.offer(new int[]{x, y});
                    grid[x][y] = 1;
                }
            }
        }
        steps++;
    }
    return -1;
}
}