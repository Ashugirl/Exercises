package dog;

public class Dog extends Wolf {
    //attributes
    private char size;

    //getters and setters


    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public void makeNoise() {


    }

    public void bark() {
        System.out.println("Woof Woof! ");
    }

    public void sit() {
        System.out.println("Sit! Good dog!");
    }

    public void printSize() {
        System.out.println("The dog's size is " + getSize());
    }


}
