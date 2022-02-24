package dog;

public class BelgianMalinois extends WorkingDog{
    private boolean dangerous;
    private double maxRunningSpeed;

    public void defend(){
        System.out.println("This dog has been trained to defend.");
    }

    public void attack(){
        System.out.println("This dog will attack on command.");
    }

    //getters and setters


    public boolean isDangerous() {
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
}
