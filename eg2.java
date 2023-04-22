import java.util.*;

public class MazeRunner {

    static int[] start = new int[2];
    static int[] end = new int[2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] directions = scanner.nextLine().split(",");
        int[][] maze = {{1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,3},
                        {1,0,1,0,1,0,1},
                        {0,0,1,0,0,0,1},
                        {1,0,1,0,1,0,1},
                        {1,0,0,0,0,0,1},
                        {1,2,1,0,1,0,1}};
        findStartAndEnd(maze);
        String result = navigateMaze(maze, start, end, directions);
        System.out.println(result);
    }

    public static void findStartAndEnd(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 2) {
                    start[0] = i;
                    start[1] = j;
                } else if (maze[i][j] == 3) {
                    end[0] = i;
                    end[1] = j;
                }
            }
        }
    }

    public static String navigateMaze(int[][] maze, int[] start, int[] end, String[] directions) {
        int[] current = {start[0], start[1]};
        for (int i = 0; i < directions.length; i++) {
            switch (directions[i]) {
                case "N":
                    current[0]--;
                    break;
                case "S":
                    current[0]++;
                    break;
                case "E":
                    current[1]++;
                    break;
                case "W":
                    current[1]--;
                    break;
            }
            if (current[0] < 0 || current[0] >= maze.length || current[1] < 0 || current[1] >= maze.length) {
                return "Dead";
            } else if (maze[current[0]][current[1]] == 1) {
                return "Dead";
            } else if (Arrays.equals(current, end)) {
                return "Finish";
            }
        }
        return "Lost";
    }
}
