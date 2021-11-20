import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        boolean flag = true;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }



        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] != matrix[j][i]) {
                    flag = false;
                    break;
                }
            }
        }
        if (!flag){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}