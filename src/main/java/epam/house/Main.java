package epam.house;

import java.util.Scanner;

public class Main {
    static
    {
        Scanner sc = new Scanner(System.in);
        System.out.format("Enter type of construction you want\n\n");
        System.out.format("1. Standard Type\n2. Luxury Type\n3. Villa Type\n");
        int option = sc.nextInt();
        System.out.format("Enter Area of House\n");
        double area = sc.nextDouble();
        sc.close();
        CalculateCost calculateCost = new CalculateCost(option ,area);
        calculateCost.costing();
    }

    public static void main(String[] args)
    {

    }
}
