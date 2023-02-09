import java.util.Scanner;

public class Laptop extends Computer{
    public Laptop(String brandName, double price, String CPU, double screenSize) {
        super(brandName, price, CPU);
    }

    @Override
    public double buyAccessories() {
        System.out.println("For just 300DKK extra you can buy a sleeve to protect your laptop, which is a good idea if you want to keep the laptop safe while travelling");
        Scanner sc = new Scanner(System.in);
        System.out.println("If you would like to add the sleeve type: 1, else type any other number.");
        int answer = sc.nextInt();
        if (answer == 1) {
            System.out.println("You've added a sleeve to shopping cart, the total value of your cart is: " + (this.price + 300) + "DKK");
            return this.price = price + 300;
        }
            else
                return this.price;
    }

    public String isReturnableAfterOpening(){
        if(brandName == "Apple"){
            System.out.println("IF YOU OPEN YOU BUY, NO REFUNDS");
            return this.brandName;
        }
        else
            System.out.println("You have 14 days to try your product, if you don't like it you can return it.");
        return this.brandName;
    }
}
