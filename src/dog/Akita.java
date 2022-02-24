package dog;

public class Akita extends PetDogs {
    private char gender;

    public void layDown() {
        System.out.println("Puppy, lay down. Puppy, lay down!");
    }

    public void dance() {
        System.out.println("Puppy, dance! Puppy, please dance! Why do you never listen to me?");
    }

    public void sing() {
        System.out.println("Puppy, sing! C'mon puppy! Sing! Stubborn dog!");
    }


    @Override
    public void sit() {
        System.out.println("Akita only sits when it wants to.");
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;

        if (gender == 'F'){
            setSize('M');
        } else {
            setSize('L');
        }

    }
}