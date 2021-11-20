import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int maxNum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > maxNum){
                maxNum = arr[i]; ;
            }
        }

        for (int i = 0 ; i < arr.length;i++) {
            if (arr[i] == maxNum){
                System.out.println(i);
                break;
            }

        }

    }
}