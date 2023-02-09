import java.util.Scanner;

public class SmartPhone extends Computer {
    public SmartPhone(String brandName, double price, String CPU, int megaPixel) {
        super(brandName, price, CPU);
    }
    @Override
    public double buyAccessories() {
        System.out.println("For just 300DKK extra you can buy a cover to protect your smartphone, which is a good idea if you want to keep the screen safe");
        Scanner sc = new Scanner(System.in);
        System.out.println("If you would like to add the cover type: 1, else type any other number.");
        int answer = sc.nextInt();
        if (answer == 1) {
            System.out.println("You've added a cover to shopping cart, the total value of your cart is: " + (this.price + 300) + "DKK");
            return this.price = price + 300;
        }
        else
            return this.price;
    }

    public double buyTransferOfData(){
        System.out.println("For 500DKK we can setup the phone for you, and transfer all of the data you have on your old phone so it's ready to go in just 15 minutes");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("If you would like to add the service type: 1, else type any other number.");
        int answer = sc1.nextInt();
        if (answer == 1) {
            System.out.println("You've added a transfer service to shopping cart, the total value of your cart is: " + (this.price + 500) + "DKK");
            System.out.println("You can pickup your phone in 15 minutes, and then it's ready to go, with everything transferred from your old phone.");
            return this.price = price + 500;
        }
        else
            return this.price;
    }

}
