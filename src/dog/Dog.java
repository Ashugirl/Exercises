package dog;

public class Dog extends Wolf {
    //attributes
    private char size;
    private static int count;

    {
        count++;
    }

    public Dog (){

    }
    public Dog(char size){
        setSize(size);
    }
    //getters and setters


    public static int getCount() {
        return count;
    }

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

    public static void sit() {
        System.out.println("Sit! Good dog!");
    }

   /* public void printSize() {
        System.out.println("The dog's size is " + getSize());
    }*/
    public static void count(){
        System.out.println("The number of dogs here is: " + getCount());
    }

}
