import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x){
                counter++;
            }
        }
        System.out.println(counter);
    }
}