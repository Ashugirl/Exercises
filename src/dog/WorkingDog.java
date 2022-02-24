package dog;

public class WorkingDog extends Dog{
    private char size = 'L';

    public void hunt(){
        System.out.println("Dog has hunting instincts.");
    }

    @Override
    public void bark() {
        super.bark();
        int times;

    }

    //getters and setters

    @Override
    public char getSize() {
        return size;
    }

    @Override
    public void setSize(char size) {
        this.size = size;
    }

    }

