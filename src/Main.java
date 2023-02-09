import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // OPGAVE 1

        Laptop Macbook = new Laptop("Apple", 15000, "m1", 14.2);
        SmartPhone Oneplus = new SmartPhone("Oneplus", 5000, "snapdragon 855", 48);
        //Macbook.isReturnableAfterOpening();
        //Macbook.buyAccessories();
        //Macbook.priceWithDiscount();
        //Oneplus.buyAccessories();
        //Oneplus.buyTransferOfData();
        //Oneplus.priceWithDiscount();

        // OPGAVE 2

        Teacher Geo = new Teacher("Geo Persson", 25000, "GH@testskolen.dk", "qwerty","Teacher","Geografi");
        Janitor Thorsten = new Janitor("Thorsten Hansen", 22000, "TH@testskolen.dk", "qwerty", "Janitor", true, true);
        ArrayList<String> classes = new ArrayList<>();
        classes.add("Geografi");
        classes.add("Tysk");
        classes.add("Kinesisk");
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Geo");
        employees.add("Thorsten");
        employees.add("Xi jingping");
        School testskolen = new School("testskolen", classes, employees);
        System.out.println(testskolen.classes);
        ArrayList<String> students = new ArrayList<>();
        students.add("Anna");
        students.add("Anne");
        Kinesisk Kinesisk101 = new Kinesisk("Kinesisk", students);
        System.out.println(Kinesisk101.students);

        // OPGAVE 3

        ArrayList<String> meatInSandwich = new ArrayList<>();
        meatInSandwich.add("Chicken");
        meatInSandwich.add("Kebab");
        meatInSandwich.add("Pepperoni");
        ArrayList<String> meatOnPizza = new ArrayList<>();
        meatOnPizza.add("Kebab");
        meatOnPizza.add("Chicken");
        ArrayList<String> meatInDurum = new ArrayList<>();
        meatInDurum.add("Kebab");
        meatInDurum.add("Chicken");
        FastFood[] obj = new FastFood[3];
        obj[0] = new Sandwich(meatInSandwich);
        obj[1] = new Pizza(meatOnPizza);
        obj[2] = new Durum(meatInDurum);
        for (int i=0;i<3;i++){
            obj[i].isCooking();
            if(obj[i] == obj[0]){
                obj[0].meatsIncluded(meatInSandwich);
            }
            else if(obj[i] == obj[1]){
                obj[1].meatsIncluded(meatOnPizza);
            }
            else
                obj[2].meatsIncluded(meatInDurum);

        }

        // OPGAVE 4
        Vehicle bmwz4 = new TwoSeater("BMW Z4", 700, 8);
        Vehicle audir8 = new TwoSeater("Audi R8", 850, 8);

        // OPGAVE 5
        RapSong rap1 = new RapSong();
        rap1.play();
        OldSchoolRap rap2 = new OldSchoolRap();
        rap2.play();
        NewSchoolRap rap3 = new NewSchoolRap();
        rap3.play();

    }
}
