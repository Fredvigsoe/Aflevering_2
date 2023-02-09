import java.util.ArrayList;

public class Durum implements FastFood{
    ArrayList<String> meatInDurum;

    public Durum(ArrayList<String> meatInDurum) {
        this.meatInDurum = meatInDurum;
    }

    @Override
    public boolean isCooking() {
        if(meatInDurum.contains("Kebab")) {
            System.out.println("WE'RE COOKING BABY");
            return true;
        }
        else
            System.out.println("Sorry can't cook the durum without kebab in it.");
        return false;
    }

    @Override
    public ArrayList<String> meatsIncluded(ArrayList<String> meatInDurum) {
        System.out.println("This Durum contains: " +meatInDurum);
        return this.meatInDurum;
    }
}
