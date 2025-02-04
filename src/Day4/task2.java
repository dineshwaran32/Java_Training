package Day4;

import java.util.Arrays;

class BFS1 {
    final int dx[] = {-1, 1, 0, 0};
    final int dy[] = {0, 0, -1, 1};
    int n;
    int startx, starty, endx, endy;

    BFS1(int n, int sx, int sy, int ex, int ey) {
        this.n = n;
        this.startx = sx;
        this.starty = sy;
        this.endx = ex;
        this.endy = ey;
    }

    int checkvalid(int x, int y, int visited[][]) {
        if ((x >= 0 && x < this.n) && (y >= 0 && y < this.n) && (visited[x][y] == 0)) {
            return 1;
        }
        return 0;
    }

    String[][] shortestpath() {
        String queue[][] = new String[n * n][4];
        int visited[][] = new int[n][n];
        for (int[] row : visited) {
            Arrays.fill(row, 0);
        }
        int num = 0;

        queue[num][0] = String.valueOf(this.startx);
        queue[num][1] = String.valueOf(this.starty);
        queue[num][2] = "0";
        queue[num][3] = "";
        
        visited[this.startx][this.starty] = 1;
        num++;

        for (int i = 0; i < num; i++) {
            int x = Integer.valueOf(queue[i][0]);
            int y = Integer.valueOf(queue[i][1]);
            int dist = Integer.valueOf(queue[i][2]);
            String path = queue[i][3];

            if (x == this.endx && y == this.endy) {
                return new String[][]{{queue[i][0], queue[i][1], queue[i][2], queue[i][3]}};
            }

            for (int d = 0; d < 4; d++) {
                int newx = x + dx[d];
                int newy = y + dy[d];
                
                if (this.checkvalid(newx, newy, visited) == 1) {
                    queue[num][0] = String.valueOf(newx);
                    queue[num][1] = String.valueOf(newy);
                    queue[num][2] = String.valueOf(dist + 1); 
                    String direction;
                    if (d == 0) {
                        direction = "U ";
                    } else if (d == 1) {
                        direction = "D ";
                    } else if (d == 2) {
                        direction = "L ";
                    } else {
                        direction = "R ";
                    }
                    queue[num][3] = path + direction;
                    visited[newx][newy] = 1;
                    num++;
                }
            }
        }

        return new String[][]{{"", "", "-1", "NILL"}};
    }
}

public class task2 {
    public static void main(String args[]) {
        int n = 3; 
        int startx = 0, starty = 0; 
        int endx = 2, endy = 1; 
        
        BFS1 bfs = new BFS1(n, startx, starty, endx, endy);
        String shortestPath[][] = bfs.shortestpath();
        System.out.println("Shortest Path Distance: " + shortestPath[0][2]);
        System.out.println("Path: " + shortestPath[0][3]);
    }
}