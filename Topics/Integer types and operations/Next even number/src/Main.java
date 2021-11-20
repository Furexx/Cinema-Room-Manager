import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        if ( a % 2 != 0 ){
            ++a ;
            System.out.println(a);
        }else System.out.println(a + 2);
    }
}
