import java.util.Arrays;

public class ShortestPath {
    public static void main(String[] args) {
        int[][] path = { {7, 4, 3, 7, 8}, {1, 2, 8, 9, 2}, {5, 2, 8, 2, 1}, {2, 6, 7, 2, 8, 2} };
       int result = shortestPath(path);
       System.out.print(result);
       System.out.println();
       result = shortestPath(path, 1);
       System.out.print(result);
    }

    public static int shortestPath(int[][] path) {
        int small = 0;
        for (int i = 0; i < path.length; i++) {
            int chota = path[i][0];
            int y = (path[i].length)-1;
            for (int j = 0; j < path[i].length; j++) {
                if (chota > path[i][j]) {
                    chota = path[i][j];
                }
                if (chota > path[i][y]) {
                    chota = path[i][y];
                }
                if(y == j){
                    break;
                }
                y--;
            }
            small += chota;
          
        }
        System.out.print("First Appoarch: ");
        return small;
    }

    public static int shortestPath(int[][] path, int n) {
        int small = 0;
        for (int i = 0; i < path.length; i++) {
            Arrays.sort(path[i]);
            small += path[i][0];
        }
        System.out.print("Second Appoarch: " );
        return small;
    }
}

