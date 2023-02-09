import java.util.ArrayList;

public class Sandwich implements FastFood{
    ArrayList<String> meatInSandwich;

    public Sandwich(ArrayList<String> meatInSandwich) {
        this.meatInSandwich = meatInSandwich;
    }

    @Override
    public boolean isCooking() {
        if(meatInSandwich.contains("Chicken")) {
            System.out.println("WE'RE COOKING BABY");
            return true;
        }
        else
            System.out.println("Sorry can't cook the sandwich without chicken in it.");
        return false;
    }

    @Override
    public ArrayList<String> meatsIncluded(ArrayList<String> meatInSandwich) {
        System.out.println("This Sandwich contains: " +meatInSandwich);
        return this.meatInSandwich;
    }


}
