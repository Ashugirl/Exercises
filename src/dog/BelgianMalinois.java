package dog;

public class BelgianMalinois extends WorkingDog{
    private boolean dangerous;
    private double maxRunningSpeed = 35;


    //comstructors
    public BelgianMalinois(){

    }

    public BelgianMalinois(boolean dangerous, double maxRunningSpeed){
        setDangerous();
        setMaxRunningSpeed(maxRunningSpeed);
    }
    //getters and setters


    //public boolean isDangerous() {
      //  return dangerous;
    //}
    public boolean getDangerous() {
        return dangerous;
    }
    public void setDangerous(){
        this.dangerous = dangerous;
    }
    public double getMaxRunningSpeed() {
        return maxRunningSpeed;
    }

    public void setMaxRunningSpeed(double maxRunningSpeed) {
        this.maxRunningSpeed = maxRunningSpeed;
    }
    public static void defend(){
        System.out.println("This dog has been trained to defend.");
    }

    public static void attack(){
        System.out.println("This dog will attack on command.");
    }
}
