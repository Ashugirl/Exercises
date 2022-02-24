package dog;

public class DogApp {


    public static void main(String[] args) {


        Dog dog1 = new Dog();
        //dog1.countMethod();
        dog1.bark();
        dog1.setSize('M');
        dog1.setLifeSpan(13);
        dog1.printSize();
        dog1.printLifeSpan();
        dog1.sit();
        System.out.println();

        Dog affenpinscher1 = new Dog();
        //affenpinscher1.countMethod();
        affenpinscher1.bark();
        affenpinscher1.setName("Wolfgang");
        affenpinscher1.nameIs();
        affenpinscher1.sit();
        affenpinscher1.makeNoise();


    }
}
