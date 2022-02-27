package dog;

public class PetDogs extends Dog{
    private char size = 'M';
    private char coat;

    //constructors
    public PetDogs(){

    }

    public PetDogs(char size, char coat){
        setSize(size);
        setCoat(coat);
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

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }
}

