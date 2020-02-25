package epam.interest;

import java.util.Scanner;

public class CalculateInterest {
    static
    {
        Scanner sc = new Scanner(System.in);
        System.out.format("Enter Principal\n");
        double principal = sc.nextInt();
        System.out.format("Enter Rate of Interest\n");
        double roi = sc.nextInt();
        System.out.format("Enter amount of time\n");
        int time = sc.nextInt();
        System.out.format("1. Simple Interest\n2. Compound Interest\n3. Exit\n");
        int option = sc.nextInt();
        switch (option)
        {
            case 1:
                double simpleInterst = ( principal * roi * time ) / 100;
                System.out.format("Your Simple Interest is :- " + simpleInterst);
                break;
            case 2:
                double compoundInterest = principal * Math.pow( ( 1 + roi / 100.0) , time );
                System.out.format("Your Compound Interest is :- " + compoundInterest);
                break;
            case 3:
                System.out.close();
                default:
                    System.out.format("wrong choice");
                    System.out.close();
        }
    }
    public static void main(String[] args)
    {

    }
}
