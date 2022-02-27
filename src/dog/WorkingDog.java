package dog;

public class WorkingDog extends Dog{
    private char size = 'L';

    //constructors
    public WorkingDog(){

    }
    public WorkingDog(char size){
        setSize(size);
    }

    @Override
    public void bark() {
        super.bark();
        int times;

    }
    public void hunt(){
        System.out.println("Dog has hunting instincts.");
    }


    //getters and setters

    @Override
    public char getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(char size) {
        super.setSize(size);
    }

    }

