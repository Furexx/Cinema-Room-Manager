import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        for (int i = 0; i <= 1000; i++) {
            if (num1*Math.pow(i,3) + num2*Math.pow(i,2) + num3*i + num4 == 0){
                System.out.println(i);
            }
        }
    }
}