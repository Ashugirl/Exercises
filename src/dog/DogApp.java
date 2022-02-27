package dog;

public class DogApp {

    public static void main(String[] args) {

    Dog[] dog = new Dog[10];
    dog[0] = new Affenpinscher("black and brown", "Wolfgang");
    dog[1] = new Akita('M');
    dog[2] = new Bergamasco(30, 'L');
    dog[3] = new Akita('F');
    dog[4] = new IrishTerrier();
    dog[5] = new Pekingese(10,'S');
    dog[6] = new BelgianMalinois(true, 35);
    dog[7] = new Pekingese(12,'s');
    dog[8] = new IrishTerrier();
    dog[9] = new Akita('F');
    for(Dog dogs : dog) {
        printDog(dogs);

    }

    }
    public static void printDog(Dog d){
        if(d instanceof Affenpinscher) {
            Affenpinscher a = (Affenpinscher) d;
            System.out.printf("This dog is an Affenpinscher. His name is %s and his color is %s.\n", a.getNickname(), a.getColor());
            Affenpinscher.dance();
            System.out.println();
        }else{
            if (d instanceof Akita){
                Akita a = (Akita) d;
                System.out.printf("This dog is an Akita. The sex is: %c, and the size is %c.\n ", a.getGender(), a.getSize() );
                Akita.sit();
                Akita.layDown();
                Akita.dance();
                Akita.sing();
                Akita.getCount();
                System.out.println();
            } else{
                if (d instanceof Pekingese){
                    Pekingese p = (Pekingese) d;
                    System.out.printf("This dog is a Pekingese. It's a %c breed, with a coat of %.2f cms. \n" , p.getSize(), p.getHairLength());
                    Pekingese.sit();
                    System.out.println();
                }else{
                    if(d instanceof Bergamasco){
                        Bergamasco b = (Bergamasco) d;
                        System.out.printf("This breed has a very long coat averaging %.2f cms and can run at speeds of %d kms per hour.\n", b.getHairLength(), b.getRunningSpeed());
                        Bergamasco.kiss();
                        System.out.println();
                    }else{
                        if (d instanceof IrishTerrier){
                            IrishTerrier i = (IrishTerrier) d;
                            System.out.println("This dog is capable of ignoring the following commands: " + i.toString());
                            IrishTerrier.familyDog();
                            IrishTerrier.hateDogs();
                            IrishTerrier.stealsFood();
                            System.out.println();
                        } else {
                            if (d instanceof BelgianMalinois){
                                BelgianMalinois b = (BelgianMalinois) d;
                                System.out.println("This dog is dangerous. True/False?: " + b.getDangerous());
                                BelgianMalinois.attack();
                                BelgianMalinois.defend();
                                System.out.println();}

                            }

                        }
                        }
                }
            }
        System.out.println("The number of dogs here is " + Dog.getCount());
        System.out.println("The number of Akitas here is " + Akita.getCount());}



    }