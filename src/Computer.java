import java.util.Scanner;

public class Computer {
    String brandName;
    double price;
    String CPU;
    public Computer(String brandName, double price, String CPU){
        this.brandName = brandName;
        this.price = price;
        this.CPU = CPU;
    }

    public double priceWithDiscount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You can get a discount if you sign a subscription, if you would like to hear more type: 1, else type any other number.");
        int answer = sc.nextInt();
        if (answer == 1){
            System.out.println("Congratulations, it was a trick question you get 25% discount for free!");
            System.out.println("The total value of your cart is: " + (this.price * 0.75) + "DKK");
            return this.price = price * 0.75;
        }
        else
            System.out.println("Sorry no discount for you");
        return this.price;
    }

    public double buyAccessories(){
        return this.price;
    }

}
