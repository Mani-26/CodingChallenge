import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=0,l=0,m=0,n=0,c=0;
        String direction[] = sc.nextLine().split(",");
        sc.close();
        int maze[][] = {{1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,3},
                        {1,0,1,0,1,0,1},
                        {0,0,1,0,0,0,1},
                        {1,0,1,0,1,0,1},
                        {1,0,0,0,0,0,1},
                        {1,2,1,0,1,0,1}};
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 2) {
                    k = i;
                    l = j;
                } 
                else if (maze[i][j] == 3) {
                    m = i;
                    n = j;
                }
            }
        }
        int current[] = {k, l};
        // int end[]={m,n};
        for (int i = 0; i < direction.length; i++) {
            switch (direction[i]) {
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
        }
        int a=current[0];
        int b=current[1];
        if (a < 0 || a >= maze.length || b < 0 || b >= maze.length){
            System.out.println("Dead");
            c=1;}
        else if (maze[current[0]][current[1]] == 1) {
            System.out.println("Dead");
            c=1;}
        else if (a==m && b==n) {
            System.out.println("Finish");
            c=1;}
        if (c==0)
            System.out.println("Lost");
    }
}