import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int n1 = num /100 ;

        int n3 = (num % 100) % 10 ;
        int n2 = ((num % 100) - n3 ) / 10;
        System.out.println(n1 + n2 + n3);
    }
}