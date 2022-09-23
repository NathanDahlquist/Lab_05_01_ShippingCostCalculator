public class ShipCostCalculator {
    public static void main(String[] args) {
        double price;
        final double SHIPPING_FEE = 0.02;
        double shippingCost;
        double totalCost;

        System.out.println("Please enter the price of your items.");
        price = 157;

        if (price >= 100){
            shippingCost = price * SHIPPING_FEE;
            totalCost = shippingCost + price;
            System.out.println("The cost is shipping was $" + shippingCost);
            System.out.println("The total purchase is $" + totalCost);
        }else{
            System.out.println("The shipping was free!");
            System.out.println("The total purchase is $" + price);
        }
    }
}