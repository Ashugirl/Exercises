package dog;

public class Bergamasco extends PetDogs{
    private int runningSpeed = 30;
    private double hairLength = 30;

    //constructors
    public Bergamasco(){

    }
    public Bergamasco(int runningSpeed, double hairLength){
        setRunningSpeed(runningSpeed);
        setHairLength(hairLength);
    }


    public int getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(int runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public double getHairLength() {
        return hairLength;
    }

    public void setHairLength(double hairLength) {
        this.hairLength = hairLength;
    }

    public static void kiss(){
        System.out.println("This dog love to give its owner kisses!");
    }
}
