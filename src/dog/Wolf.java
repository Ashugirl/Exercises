package dog;

public class Wolf {
    private String name;
    private int lifeSpan;

    public void makeNoise(){
        System.out.println("Awoooooooooooooo!");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public void printLifeSpan(){
        System.out.println("This animal's life span is generally " + getLifeSpan());

    }
    public void nameIs(){
        System.out.println("This doggie is named " + name);
    }
}
