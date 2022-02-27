package dog;

public class Akita extends PetDogs {
    private char gender;
    private static int count;

    {
        count++;
    }

//constructors
    public Akita(){

    }
    public Akita(char gender){
        setGender(gender);
    }
    // getters and setters
    public static int getCount() {
        return count;
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
    public static void sit() {
        System.out.println("Akita only sits when it wants to.");
    }

    public static void layDown() {
        System.out.println("Puppy, lay down. Puppy, lay down!");
    }

    public static void dance() {
        System.out.println("Puppy, dance! Puppy, please dance! Why do you never listen to me?");
    }

    public static void sing() {
        System.out.println("Puppy, sing! C'mon puppy! Sing! Stubborn dog!");
    }


}