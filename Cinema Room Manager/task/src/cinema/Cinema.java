package cinema;

import java.util.Scanner;

public class Cinema {

    static int seats;
    static int rows;
    final static Scanner scanner = new Scanner(System.in);
    static int ticketCount;
    static double ticketsPercentage;
    static int income;




    public static void main(String[] args) {
        // Write your code here

        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        seats = scanner.nextInt();
        int ALL_SEATS = seats * rows;
        String[][] cinema = new String[rows+1][seats+1];



        int totalIncome;
        int frontHalf = rows / 2;
        if (ALL_SEATS < 60){
            totalIncome = ALL_SEATS * 10;
        }
        else {
           totalIncome = ((frontHalf * 10) + ((rows - frontHalf) * 8))* seats;
        }


        setCinema(cinema);

        while (true) {

            printMenu();
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:

                    printCinema(cinema);
                    break;


                case 2:

                   buyTicket(cinema);

                    break;

                case 3:
                    printStatistics(ticketsPercentage,income,totalIncome);

                    break;

                case 0:
                    return;
            }
        }


    }

    static void setCinema(String[][] cinema) {
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if (i == 0 && j == 0) {
                    cinema[i][j] = " ";

                } else if (i == 0){
                    cinema[i][j] = String.valueOf(j);
                }else if (j == 0){
                    cinema[i][j] = String.valueOf(i);
                }else {
                    cinema[i][j] = "S";
                }

            }
        }
    }

    private static void printCinema(String[][] cinema) {
        System.out.println("Cinema:");
        for (String[] row : cinema) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();

    }

}

 public static void buyTicket(String[][] cinema) {

        boolean flag = true;
        while (flag) {
            System.out.println("Enter a row number:");
            int reservedRow = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            int reservedSeat = scanner.nextInt();
            if (reservedRow > rows || reservedSeat > seats || reservedRow <= 0 || reservedSeat <= 0) {
                System.out.println("Wrong input!");

            } else if (cinema[reservedRow][reservedSeat].equals("B")) {
                System.out.println("That ticket has already been purchased!");

            } else {

                int ticketPrice = rows * seats < 60 ? 10 : (reservedRow <= rows / 2 ? 10 : 8);
                System.out.printf("Ticket price: $%d\n\n", ticketPrice);
                cinema[reservedRow][reservedSeat] = "B";
                ticketCount++;
                ticketsPercentage = ((float) ticketCount/(float) (rows * seats)*100);
                income = income + ticketPrice;
                flag = false;
            }

        }

    }




    static void printMenu(){
        System.out.println("\n1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit\n");
    }

    static void printStatistics(double ticketsPercentage,int income,int totalIncome){

        System.out.printf("Number of purchased tickets: %d\n",ticketCount);
        System.out.printf("Percentage: %.2f%%\n",ticketsPercentage);
        System.out.println("Current income: $" + income);
        System.out.println("Total income: $" + totalIncome);
    }
}
