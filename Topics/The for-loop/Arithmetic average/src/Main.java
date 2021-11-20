import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;
        int counter = 0;
        
        for(int i = a;i <= b;i++){
            if(i % 3 == 0){
                sum += i;
                counter++;
            }
        }
        System.out.println((double)sum/counter);
    }
}
