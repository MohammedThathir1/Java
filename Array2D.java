import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[][] arrJagged = new int[3][];
        //int arrJagged [][] = {{1,2,3},{5,2},{9,7,6,3,5}};

        int matrix[][] = {  {11,12,13,14},       // {11, 21, 31}
                            {21,22,23,24},       // {12, 22, 32}
                            {31,32,33,34}};      // {13, 23, 33}
                                                 // {14, 24, 34}
        int trasposeMatrix[][] = new int[4][3];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
                trasposeMatrix[i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(trasposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
