import java.util.ArrayList;

public class Pizza implements FastFood{
    ArrayList<String> meatOnPizza;

    public Pizza(ArrayList<String> meatOnPizza) {
        this.meatOnPizza = meatOnPizza;
    }

    @Override
    public boolean isCooking() {
        if(meatOnPizza.contains("Kebab")) {
            System.out.println("WE'RE COOKING BABY");
            return true;
        }
        else
        System.out.println("Sorry can't cook the pizza without kebab on it.");
            return false;
    }

    @Override
    public ArrayList<String> meatsIncluded(ArrayList<String> meatOnPizza) {
        System.out.println("This Pizza contains: " +meatOnPizza);
        return this.meatOnPizza;
    }
}
