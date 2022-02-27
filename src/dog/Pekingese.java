package dog;

public class Pekingese extends PetDogs {
    private double hairLength = 10;


    public Pekingese(){

    }
    public Pekingese(double hairLength, char size){
        setHairLength();
        super.setSize(size);
    }
    public double getHairLength() {
        return hairLength;
    }
    public void setHairLength(){
        this.hairLength = hairLength;
    }

    public static void play(){
        System.out.println("Doggy likes to play!");
    }
}
