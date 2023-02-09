public class TwoSeater implements Vehicle{
    String modelName;
    int horsePower;
    int amountOfGears;
    public TwoSeater(String modelName, int horsePower, int amountOfGears){
        this.modelName = modelName;
        this.horsePower = horsePower;
        this.amountOfGears = amountOfGears;
    }
    @Override
    public void changeGear(int a) {
        if(a > this.amountOfGears){
            System.out.println("Sorry the " + this.modelName + " might be a beast, but this amount of gears is not realistic");
        }
        if(a < 0){
            System.out.println("Error can't go below 0");
        }

    }

    @Override
    public void speedUp(int a) {
        System.out.println("Finally a change of pace, you're driving like my grandma!");
        if(a >= 100){
            System.out.println("We're going fast, thats great! Watch out for the cops though.");
        }
        if(a < 100){
            System.out.println("Why are we driving so slow, you're driving a beast of a car let loose!");
        }
        if(a > 200){
            System.out.println("Maybe you should slow down a bit, so we don't kill anyone. We're driving: " +a +" KM/H. call the applyBrakes method.");
        }
    }

    @Override
    public void applyBrakes(int a) {
        System.out.println("TOO BAD THE BRAKES DONT WORK, FULL SEND BABY");
    }
}
