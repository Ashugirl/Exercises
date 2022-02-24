package dog;

public class PetDogs extends Dog{
    private char size = 'M';
    private char coat;

//getters and setters


    @Override
    public char getSize() {
        return size;
    }

    @Override
    public void setSize(char size) {
        this.size = size;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }
}

