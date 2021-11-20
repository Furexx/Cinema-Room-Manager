import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrNum = scanner.nextInt();
        int[] arr = new int[arrNum];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > n ){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}