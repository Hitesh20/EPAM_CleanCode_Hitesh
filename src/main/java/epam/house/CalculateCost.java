package epam.house;

public class CalculateCost {

    private int option;
    private double area;

    public CalculateCost(int option, double area) {
        this.option = option;
        this.area = area;
    }

    public int costPerStandard(int option)
    {
        int cost = 0;
        if(option == 1) {
            return 1200;
        } else if(option == 2) {
            return 1500;
        } else if(option == 3) {
            return 1800;
        } else {
            System.out.format("Invalid Option. You will get 0.\n");
            return 0;
        }
    }
    public void costing()
    {
        double totalPrice = this.area * costPerStandard(this.option);
        System.out.format("Total Price :- " + totalPrice);
    }
}
