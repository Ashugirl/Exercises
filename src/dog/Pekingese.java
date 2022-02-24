package dog;

public class Pekingese extends PetDogs {
    private double hairLength = 10;

    public void play(){
        System.out.println("Doggy likes to play!");
    }

    public double getHairLength() {
        return hairLength;
    }
    public void setHairLength(){
        this.hairLength = hairLength;
    }
}
